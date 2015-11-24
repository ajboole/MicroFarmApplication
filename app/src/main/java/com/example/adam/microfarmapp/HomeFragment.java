package com.example.adam.microfarmapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;

/**
 * Created by Adam on 11/24/2015.
 */
public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fragment, container, false);

        final Button button = (Button) view.findViewById(R.id.homebutton1);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){

                        buttonClicked(v);

                    }
                }
        );
        return view;
    }

    public void buttonClicked(View view){

        Intent i = new Intent(getContext(), MainActivity.class);
        startActivity(i);

    }

}
