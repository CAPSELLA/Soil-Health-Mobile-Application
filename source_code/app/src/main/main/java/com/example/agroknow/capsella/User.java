package com.example.agroknow.capsella;

import android.app.Application;


public class User extends Application {

    private String mGlobaltoken;
    private String mGlobalBuffer;
    private String mGlobalUrl;
    private String mGlobalfullName;
    private int mGlobalCODE;
    private int mGlobalNumOfLay;

    private double mGlobalLat;
    private double mGlobalLon;





    public String getGlobalVarValue() {

        return mGlobaltoken;
    }

    public void setGlobalVarValue(String str) {

        mGlobaltoken = str;

    }


    public String getGlobalVarValue2() {

        return mGlobalBuffer;
    }


    public void setGlobalVarValue2(String str2) {

        mGlobalBuffer = str2;

    }


    public String getGlobalVarValueUrl() {

        return mGlobalUrl;
    }

    public void setGlobalVarValueUrl(String str3) {

        mGlobalUrl = str3;
    }





    public String getGlobalfullName() {

        return mGlobalfullName;
    }

    public void setGlobalfullName(String str4) {

        mGlobalfullName = str4;
    }





    public int getGlobalCODE() {

        return mGlobalCODE;
    }

    public void setGlobalCODE(int str5) {

        mGlobalCODE = str5;
    }



    public int getmGlobalNumOfLay() {

        return mGlobalNumOfLay;
    }

    public void setmGlobalNumOfLay(int str6) {

        mGlobalNumOfLay = str6;
    }


    public double getmGlobalLat() {

        return mGlobalLat ;

    }

    public void setmGlobalLat(double str7) {

        mGlobalLat = str7;
    }


    public double getmGlobalLon() {

        return mGlobalLon ;

    }

    public void setmGlobalLon(double str8) {

        mGlobalLon = str8;
    }


}
