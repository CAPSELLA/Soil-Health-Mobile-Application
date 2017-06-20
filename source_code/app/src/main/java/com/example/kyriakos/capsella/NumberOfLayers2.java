//This program is free software: you can redistribute it and/or modify
//        * it under the terms of version 3 of the GNU General Public License as published by
//        * the Free Software Foundation, or (at your option) any later version.
//        *
//        * This program is distributed in the hope that it will be useful,
//        * but WITHOUT ANY WARRANTY; without even the implied warranty of
//        * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//        * GNU General Public License for more details.
//        *
//        * You should have received a copy of the GNU General Public License
//        *License


package com.example.kyriakos.capsella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by Kyriakos on 06-Jun-17.
 */

public class NumberOfLayers2 extends Activity {

    int clickYescount = 0;
    int clickNocount = 0;


    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_of_layers_2);


        Button NextButtonYes = (Button) findViewById(R.id.NumOfLayYesButton);
        NextButtonYes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                 clickYescount= clickYescount + 1;
                if (clickYescount == 1){
                    Toast.makeText(getApplicationContext(),"are you sure?",Toast.LENGTH_SHORT).show();

                }
                else {
                    NumberOfLayers.i = NumberOfLayers.i + 1;
                    Intent myIntent = new Intent(view.getContext(), Question9.class);

                    startActivityForResult(myIntent, 0);
                    finish();
                }

            }
        });


        Button NextButtonNo = (Button) findViewById(R.id.NumOfLayNoButton);
        NextButtonNo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (clickNocount == 1){
                    Toast.makeText(getApplicationContext(),"are you sure?",Toast.LENGTH_SHORT).show();

                }
                else {

                    Intent myIntent = new Intent(view.getContext(), Question20.class);
                    startActivityForResult(myIntent, 0);
                    finish();
                }

            }
        });


    }





    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press back again if you want to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

                                      @Override
                                      public void run() {
                                          doubleBackToExitPressedOnce=false;

                                      }
                                  }

                , 2000);
    }


}
