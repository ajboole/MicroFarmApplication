package com.example.adam.microfarmapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button button = (Button) findViewById(R.id.homebuttonsettings);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {

                        Intent i = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(i);

                    }
                }
        );

        //tiny animated square code
        ImageView myImageView = (ImageView) findViewById(R.id.imageSquareSettings);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.tween);
        myImageView.startAnimation(myFadeInAnimation);

    }

}
