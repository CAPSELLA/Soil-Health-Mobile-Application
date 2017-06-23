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



package com.example.agroknow.capsella;

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
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class Question5 extends Activity {



    private CheckBox checkBoxQuestion2;
    private CheckBox checkBoxQuestion3;
    private CheckBox checkBoxQuestion4;
    private CheckBox checkBoxQuestion5;
    private CheckBox checkBoxQuestion6;
    private CheckBox checkBoxQuestion;


    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);

        checkBoxQuestion = (CheckBox) findViewById(R.id.checkBox) ;
        checkBoxQuestion2 = (CheckBox) findViewById(R.id.checkBox2) ;
        checkBoxQuestion3 = (CheckBox) findViewById(R.id.checkBox3) ;
        checkBoxQuestion4 = (CheckBox) findViewById(R.id.checkBox4) ;
        checkBoxQuestion5 = (CheckBox) findViewById(R.id.checkBox5) ;
        checkBoxQuestion6 = (CheckBox) findViewById(R.id.checkBox6) ;






        Button NextButton = (Button) findViewById(R.id.Q5NextButton);
        NextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                saveDataToFile3();


                    if (checkBoxQuestion.isChecked()) {
                        if (checkBoxQuestion2.isChecked() || checkBoxQuestion3.isChecked() || checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked()) {
                            String AnswerQ5 = checkBoxQuestion.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile(AnswerQ5, fileName);
                        } else {
                            String AnswerQ5 = checkBoxQuestion.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile2(AnswerQ5, fileName);
                        }
                    }


                    if (checkBoxQuestion2.isChecked()) {
                        if (checkBoxQuestion3.isChecked() || checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked()) {
                            String AnswerQ5 = checkBoxQuestion2.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile(AnswerQ5, fileName);
                        } else {
                            String AnswerQ5 = checkBoxQuestion2.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile2(AnswerQ5, fileName);
                        }
                    }

                    if (checkBoxQuestion3.isChecked()) {
                        if (checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked()) {
                            String AnswerQ5 = checkBoxQuestion3.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile(AnswerQ5, fileName);
                        } else {
                            String AnswerQ5 = checkBoxQuestion3.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile2(AnswerQ5, fileName);
                        }
                    }

                    if (checkBoxQuestion4.isChecked()) {
                        if (checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked()) {
                            String AnswerQ5 = checkBoxQuestion4.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile(AnswerQ5, fileName);
                        } else {
                            String AnswerQ5 = checkBoxQuestion4.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile2(AnswerQ5, fileName);
                        }
                    }

                    if (checkBoxQuestion6.isChecked()) {
                        if (checkBoxQuestion6.isChecked()) {
                            String AnswerQ5 = checkBoxQuestion5.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile(AnswerQ5, fileName);
                        } else {
                            String AnswerQ5 = checkBoxQuestion5.getText().toString();
                            String fileName = "spade.txt";
                            saveDataToFile2(AnswerQ5, fileName);
                        }
                    }

                    if (checkBoxQuestion6.isChecked()) {
                        String AnswerQ5 = checkBoxQuestion6.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ5, fileName);
                    }


                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                   if (checkBoxQuestion.isChecked() || checkBoxQuestion2.isChecked() || checkBoxQuestion3.isChecked() || checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked()) {

                        Intent myIntent = new Intent(view.getContext(), Question7.class);
                        startActivityForResult(myIntent, 0);
                        finish();
                    } else {

                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.Mtoast6), Toast.LENGTH_SHORT).show();
                    }



            }
        });
    }

    public void saveDataToFile(String answer, String fileName) {

        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile,true);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            myOutWriter.append("    " +"\""+answer+"\"," + "\n" );
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }



    }







    public void saveDataToFile2(String answer, String fileName) {


        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile,true);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            myOutWriter.append("    " +"\""+answer+"\"" + "\n" + "  ],"+ "\n");
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }



    }

    public void saveDataToFile3() {


        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile,true);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            myOutWriter.append("  " + "\"sois\":" + " " + "[" + "\n");
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }


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
