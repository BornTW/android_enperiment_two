package com.example.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Tone_one;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main2ActivityLife","调用 onCreate()");
        //Tone_one = (TextView)findViewById(R.id.one_one);

    }
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        Log.i("Main2ActivityLife","调用 onStart()");
        //Log.d("sffsd","onDestroy");
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Log.i("Main2ActivityLife","调用 onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Log.i("Main2ActivityLife","调用 onResume()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        Log.i("Main2ActivityLife","调用 onResume()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        Log.i("Main2ActivityLife","调用 onResume()");
    }
}
