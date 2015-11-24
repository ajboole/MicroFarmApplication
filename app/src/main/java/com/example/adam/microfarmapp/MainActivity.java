package com.example.adam.microfarmapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *
 * Main Activity also known as the Home Screen where we can access all
 * the elements (light, temp, water, humidity, stats, history, settings)
 *
 * uses tween.xml from anim
 * and a bunch of xml files in the layout
 *
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "mymessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tiny animated square code
        ImageView myImageView = (ImageView) findViewById(R.id.imageSquare);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.tween);
        myImageView.startAnimation(myFadeInAnimation);


        Log.i(TAG, "onCreate");
    }

    //Method to go to LightScreen when Light button is pressed
    public void onClickLight(View view){

        Intent i = new Intent(this, LightScreen.class);
        startActivity(i);

    }

    //method to go to TempScreen when temp button is pressed
    public void onClickTemp(View view){

        Intent i = new Intent(this, TempScreen.class);
        startActivity(i);

    }

    //method to go to WaterScreen when water button is pressed
    public void onClickWater(View view){

        Intent i = new Intent(this, WaterScreen.class);
        startActivity(i);

    }

    //method to go to HumidityScreen when humidity button is pressed
    public void onClickHumidity(View view){

        Intent i = new Intent(this, HumidityScreen.class);
        startActivity(i);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
