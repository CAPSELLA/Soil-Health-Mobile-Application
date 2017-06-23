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



public class Question7 extends Activity {

    private CheckBox checkBoxQuestion2;
    private CheckBox checkBoxQuestion3;
    private CheckBox checkBoxQuestion4;
    private CheckBox checkBoxQuestion5;
    private CheckBox checkBoxQuestion6;
    private CheckBox checkBoxQuestion7;
    private CheckBox checkBoxQuestion8;
    private CheckBox checkBoxQuestion9;
    private CheckBox checkBoxQuestion10;
    private CheckBox checkBoxQuestion11;
    private CheckBox checkBoxQuestion12;
    private CheckBox checkBoxQuestion;




    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question7);

        checkBoxQuestion = (CheckBox) findViewById(R.id.checkBox) ;
        checkBoxQuestion2 = (CheckBox) findViewById(R.id.checkBox2) ;
        checkBoxQuestion3 = (CheckBox) findViewById(R.id.checkBox3) ;
        checkBoxQuestion4 = (CheckBox) findViewById(R.id.checkBox4) ;
        checkBoxQuestion5 = (CheckBox) findViewById(R.id.checkBox5) ;
        checkBoxQuestion6 = (CheckBox) findViewById(R.id.checkBox6) ;
        checkBoxQuestion7 = (CheckBox) findViewById(R.id.checkBox7) ;
        checkBoxQuestion8 = (CheckBox) findViewById(R.id.checkBox8) ;
        checkBoxQuestion9 = (CheckBox) findViewById(R.id.checkBox9) ;
        checkBoxQuestion10 = (CheckBox) findViewById(R.id.checkBox10) ;
        checkBoxQuestion11 = (CheckBox) findViewById(R.id.checkBox11) ;
        checkBoxQuestion12 = (CheckBox) findViewById(R.id.checkBox12) ;



        Button NextButton = (Button) findViewById(R.id.Q7NextButton);
        NextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                saveDataToFile4();

                if (checkBoxQuestion.isChecked()) {
                    if (checkBoxQuestion2.isChecked() || checkBoxQuestion3.isChecked() || checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked() || checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    }
                    else{

                        String AnswerQ7 = checkBoxQuestion.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion2.isChecked()) {
                    if (checkBoxQuestion3.isChecked() || checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked() || checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion2.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    }
                    else{
                        String AnswerQ7 = checkBoxQuestion2.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion3.isChecked()) {
                    if (checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked() || checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion3.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    }
                    else{
                        String AnswerQ7 = checkBoxQuestion3.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion4.isChecked()) {
                    if (checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked() || checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion4.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    }
                    else{
                        String AnswerQ7 = checkBoxQuestion4.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }


                if (checkBoxQuestion5.isChecked()) {
                    if (checkBoxQuestion6.isChecked() || checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion5.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    }
                    else{
                        String AnswerQ7 = checkBoxQuestion5.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion6.isChecked()) {
                    if (checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion6.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    }
                    else{
                        String AnswerQ7 = checkBoxQuestion6.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }


                if (checkBoxQuestion7.isChecked()) {
                    if (checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {


                        String AnswerQ7 = checkBoxQuestion7.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    } else {
                        String AnswerQ7 = checkBoxQuestion7.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion8.isChecked()) {
                    if (checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {
                        String AnswerQ7 = checkBoxQuestion8.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    } else {
                        String AnswerQ7 = checkBoxQuestion8.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }


                if (checkBoxQuestion9.isChecked()) {
                    if (checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion9.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    } else {
                        String AnswerQ7 = checkBoxQuestion9.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion10.isChecked()) {
                    if (checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion10.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    } else {
                        String AnswerQ7 = checkBoxQuestion10.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion11.isChecked()) {
                    if (checkBoxQuestion12.isChecked()) {

                        String AnswerQ7 = checkBoxQuestion11.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile(AnswerQ7, fileName);
                    } else {
                        String AnswerQ7 = checkBoxQuestion11.getText().toString();
                        String fileName = "spade.txt";
                        saveDataToFile2(AnswerQ7, fileName);
                    }
                }

                if (checkBoxQuestion12.isChecked()) {
                    String AnswerQ7 = checkBoxQuestion12.getText().toString();
                    String fileName = "spade.txt";
                    saveDataToFile2(AnswerQ7, fileName);
                }


                String fileName = "spade.txt";
                saveDataToFile1(fileName);

                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (checkBoxQuestion2.isChecked() || checkBoxQuestion3.isChecked() || checkBoxQuestion4.isChecked() || checkBoxQuestion5.isChecked() || checkBoxQuestion6.isChecked() || checkBoxQuestion7.isChecked() || checkBoxQuestion8.isChecked() || checkBoxQuestion9.isChecked() || checkBoxQuestion10.isChecked() || checkBoxQuestion11.isChecked() || checkBoxQuestion12.isChecked()) {

                    Intent myIntent = new Intent(view.getContext(), Question6.class);
                    startActivityForResult(myIntent, 0);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Mtoast6),Toast.LENGTH_SHORT).show();

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
            myOutWriter.append("    " + "\"" + answer + "\"," + "\n");
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }

//        Log.d("Checks", "Trying to save data");
//
//        try {
//            // Set up the file directory
//            String filePath = Environment.getExternalStorageDirectory().toString() + "/Data Folder";
//            File fileDirectory = new File(filePath);
//
//            Log.d("Checks", "Directory created");
//
//            // Set up the file itself
//            File textFile = new File(fileDirectory, fileName);
//            Log.d("Checks", "File created");
//
//            // Write to the file
//            FileOutputStream fileOutputStream = new FileOutputStream(textFile, true);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//            outputStreamWriter.append("    " + "\"" + answer + "\"," + "\n");
//            outputStreamWriter.close();
//            fileOutputStream.close();
//
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
//        }

    }


    public void saveDataToFile1(String fileName) {

        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile,true);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            myOutWriter.append("   " + "]," + " \n ");
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }

//        Log.d("Checks", "Trying to save data");
//
//        try {
//            // Set up the file directory
//            String filePath = Environment.getExternalStorageDirectory().toString() + "/Data Folder";
//            File fileDirectory = new File(filePath);
//
//            Log.d("Checks", "Directory created");
//
//            // Set up the file itself
//            File textFile = new File(fileDirectory, fileName);
//            Log.d("Checks", "File created");
//
//            // Write to the file
//            FileOutputStream fileOutputStream = new FileOutputStream(textFile, true);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//            outputStreamWriter.append("   " + "]," + " \n ");
//            outputStreamWriter.close();
//            fileOutputStream.close();
//
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
//        }

    }


    public void saveDataToFile2(String answer, String fileName) {

        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile,true);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            myOutWriter.append("    " + "\"" + answer + "\"" + "\n");
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }

//        Log.d("Checks", "Trying to save data");
//
//        try {
//            // Set up the file directory
//            String filePath = Environment.getExternalStorageDirectory().toString() + "/Data Folder";
//            File fileDirectory = new File(filePath);
//
//            Log.d("Checks", "Directory created");
//
//            // Set up the file itself
//            File textFile = new File(fileDirectory, fileName);
//            Log.d("Checks", "File created");
//
//            // Write to the file
//            FileOutputStream fileOutputStream = new FileOutputStream(textFile, true);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//            outputStreamWriter.append("    " + "\"" + answer + "\"" + "\n");
//            outputStreamWriter.close();
//            fileOutputStream.close();
//
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
//        }
    }

    public void saveDataToFile4() {

        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile,true);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            myOutWriter.append("  "+"\""+ "wilpla" + "\":"+" "  + "["+"\n" );
            myOutWriter.close();
            fOut.close();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }

//        Log.d("Checks", "Trying to save data");
//
//        try {
//            // Set up the file directory
//            String filePath = Environment.getExternalStorageDirectory().toString() + "/Data Folder";
//            File fileDirectory = new File(filePath);
//
//            Log.d("Checks", "Directory created");
//
//            // Set up the file itself
//            File textFile = new File(fileDirectory, fileName);
//            Log.d("Checks", "File created");
//
//            // Write to the file
//            FileOutputStream fileOutputStream = new FileOutputStream(textFile, true);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//            outputStreamWriter.append("  "+"\""+ "wilpla" + "\":"+" "  + "["+"\n" );
//            outputStreamWriter.close();
//            fileOutputStream.close();
//
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
//        }

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
