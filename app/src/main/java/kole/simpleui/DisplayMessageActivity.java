package kole.simpleui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Get the message from the intent
        // Extracting from SimpleUI
        Intent intent = getIntent();
        String message = intent.getStringExtra(SimpleUI.EXTRA_MESSAGE);
        // Create te text view
        // and set the size & message
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        // Set the text view as the activity layout
        setContentView(textView);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    } // end of onCreate( )

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle app bar item clicks here. The app bar
        // automatically handles clicks on the Home/Up button,
        // As long as AndroidManifest.xml specifies parent activity
        int id = item.getItemId();
        // noinspection SimplifiableIfStatement
        if(id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    } // end of onOptionsItemSelected( )
} // end of class DisplayMessageActivity
