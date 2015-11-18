package kole.simpleui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class SimpleUI extends AppCompatActivity
{
    public final static String EXTRA_MESSAGE = "kole.simpleui.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_ui);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ic_droid);
    } // end of onCreate( )

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_ui, menu);
        return true;
    } // end of onCreateOptionsMenu( )

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    } // end of onOptionsItemSelected( )

    /**
     * sendMessage( ) - Called when user clicks the send button,
     *                  Used to start the DisplayMessageActivity
     * @param view - The view that the user clicked
     */
    public void sendMessage(View view)
    {
        // Create a new intent object for the DisplayMessageActivity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Create a new EditText object and search for an existing
        // EditText tag with the specified id
        EditText editText = (EditText) findViewById(R.id.edit_message);
        // Extract the user text from the EditText box
        // Convert it to a string and save it to variable message
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        // Start the new activity (DisplayMessageActivity)
        startActivity(intent);
    } // end of sendMessage( )
} // end of class SimpleUI