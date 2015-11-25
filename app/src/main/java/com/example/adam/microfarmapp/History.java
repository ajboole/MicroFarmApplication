package com.example.adam.microfarmapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        /**

        Button button = (Button) findViewById(R.id.homebuttonhist);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){

                        Intent i = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(i);

                    }
                }
        );

        //tiny animated square code
        ImageView myImageView = (ImageView) findViewById(R.id.imageSquareHist);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.tween);
        myImageView.startAnimation(myFadeInAnimation);

         **/

    }

}
