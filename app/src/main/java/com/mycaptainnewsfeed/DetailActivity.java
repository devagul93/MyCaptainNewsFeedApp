package com.mycaptainnewsfeed;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Codestation on 16/09/16.
 */
public class DetailActivity extends AppCompatActivity {

    TextView messageText;
    public static final String TAG_LIFECYCLE = "lifecycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //logging the process
        Log.d(TAG_LIFECYCLE,"onCreate");


        setContentView(R.layout.activity_detail);
        Intent recdIntent = getIntent();
        messageText = (TextView) findViewById(R.id.message);
        if (recdIntent!=null){
            if (recdIntent.hasExtra("message"));{
                String messageValue = recdIntent.getStringExtra("message");
                messageText.setText(messageValue);
            }
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        //logging the process
        Log.d(TAG_LIFECYCLE,"onStart");

    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        //logging the process
        Log.d(TAG_LIFECYCLE,"onResume");

    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        //logging the process
        Log.d(TAG_LIFECYCLE,"onPause");

    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        //logging the process
        Log.d(TAG_LIFECYCLE,"onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //logging the process
        Log.d(TAG_LIFECYCLE,"onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        //logging the process
        Log.d(TAG_LIFECYCLE,"onDestroy");

    }
}
