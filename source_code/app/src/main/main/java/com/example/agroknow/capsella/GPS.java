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

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class GPS extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gps);


        Button NextButton = (Button) findViewById(R.id.GPSButton);
        NextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);


            }
        });
        final Button NextButton1 = (Button) findViewById(R.id.GPSNextButton);

        NextButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Language_Choose.flagG == true) {

                    Intent myIntent = new Intent(view.getContext(), UserInformation.class);
                    startActivityForResult(myIntent, 0);
                    finish();
                } else {

                    Toast.makeText(getApplicationContext(), "Please enable your gps ", Toast.LENGTH_SHORT).show();

                }
            }
        });

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 10, new GPS.Listener());
        // Have another for GPS provider just in case.
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 10, new GPS.Listener());
        // Try to request the location immediately
        Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        if (location == null) {
            location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        }
        if (location != null) {
            handleLatLng(location.getLatitude(), location.getLongitude());
        }
        // Toast.makeText(getApplicationContext(), getResources().getString(R.string.Mtoast), Toast.LENGTH_LONG).show();


    }

    private void handleLatLng(double latitude, double longitude) {
        Log.v("TAG", "(" + latitude + "," + longitude + ")");

    }


    private class Listener implements LocationListener {
        public void onLocationChanged(Location location) {
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();


            if (Language_Choose.flagG == false) {
                if (Language_Choose.i == 0) {
                    User ob = ((User) getApplicationContext());
                    ob.setmGlobalLat(latitude);
                    ob.setmGlobalLon(longitude);
                    String fileName = "SpadeTest";
                    saveDataToFile(latitude, longitude, fileName);
                    Language_Choose.i = 1;
                }
            }

            handleLatLng(latitude, longitude);
        }

        public void onProviderDisabled(String provider) {
        }

        public void onProviderEnabled(String provider) {
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
    }


    public void saveDataToFile(Double Latitude, Double Longitude, String fileName) {


        try {
            File myFile = new File("/sdcard/SpadeTest.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile);
            OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
            myOutWriter.append("{" + "\n" + "  " + "\"lat\":" + " " + "\"" + Latitude + "\"," + "\n");
            myOutWriter.append("  " + "\"lon\":" + " " + "\"" + Longitude + "\"," + "\n");

            myOutWriter.close();
            fOut.close();
            Language_Choose.flagG = true;
            getCompleteAddressString(Latitude,Longitude);


        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }


    }


    private String getCompleteAddressString(double LATITUDE, double LONGITUDE) {
        String strAdd = "";
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1);
            if (addresses != null) {
                Address returnedAddress = addresses.get(0);
                StringBuilder strReturnedAddress = new StringBuilder("");

                for (int i = 0; i < returnedAddress.getMaxAddressLineIndex(); i++) {
                    strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n");
                }
                strAdd = strReturnedAddress.toString();
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.Mtoast7) + strReturnedAddress.toString()+ "{" + LATITUDE +","+ LONGITUDE+ "}" , Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.Mtoast8)+ "{" + LATITUDE +","+ LONGITUDE+ "}" , Toast.LENGTH_LONG).show();

            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),getResources().getString(R.string.Mtoast8)+ "{" + LATITUDE +","+ LONGITUDE+ "}" , Toast.LENGTH_LONG).show();
        }
        return strAdd;
    }


}

