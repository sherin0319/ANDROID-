package com.example.sjcet.activityl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
    }
    protected void  onStart()
    {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    protected void onPause() {
        super.onResume();
        Log.d("lifecycle","onPause invoked");
    }
    protected void onStop() {
        super.onResume();
        Log.d("lifecycle","onStop invoked");
    }
    protected void onRestart() {
        super.onResume();
        Log.d("lifecycle","onRestart invoked");
    }
    protected void onDestroy() {
        super.onResume();
        Log.d("lifecycle","onDestroy invoked");
    }
}
