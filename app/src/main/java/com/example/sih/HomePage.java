package com.example.sih;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

public class HomePage extends AppCompatActivity implements LocationListener {
    LocationManager locationManager;
    final static String[] PERMISSIONS = {Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION};
    final static int PERMISSIONS_ALL =1;
    TextView yamdist, gangdist, kedardist, badridist;
    CardView yamunotricard;
    LocationListener locationListener;
    final long MIN_TIME = 5000;
    String Location_Provider=LocationManager.GPS_PROVIDER;
    final float MIN_DISTANCE = 1000;
    Double Latitude, Longitude;
    final int REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);
        yamdist = findViewById(R.id.yamdist);
        gangdist = findViewById(R.id.gangdist);
        kedardist = findViewById(R.id.kedardist);
        badridist = findViewById(R.id.badridist);
        yamunotricard=findViewById(R.id.yamunotricard);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        if(Build.VERSION.SDK_INT>=23){
            requestPermissions(PERMISSIONS, PERMISSIONS_ALL);
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                requestLocation();
                handler.postDelayed(this,1000);
            }
        },1000);
        yamunotricard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,DataPage.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        Latitude = location.getLatitude();
        Longitude = location.getLongitude();
        Log.d("mylog","Get Location"+location.getLatitude() + "," + location.getLongitude());
        Location currentLocation = new Location("locationA");
        currentLocation.setLatitude(17.372102);
        currentLocation.setLongitude(78.484196);
        Location yamunotri = new Location("locationB");
        yamunotri.setLatitude(31.01450);
        yamunotri.setLongitude(78.46044);
        double dist1 = currentLocation.distanceTo(yamunotri);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        String exact_yamunotri = df.format((dist1/1000));
        yamdist.setText(exact_yamunotri+" KM");
        Location gangotri = new Location("locationC");
        gangotri.setLatitude(31.00081);
        gangotri.setLongitude(78.92944);
        double dist2 = currentLocation.distanceTo(gangotri);
        String exact_gangotri = df.format((dist2/1000));
        gangdist.setText(exact_gangotri+" KM");
        Location kedarnath = new Location("locationD");
        kedarnath.setLatitude(30.76117);
        kedarnath.setLongitude(79.07015);
        double dist3 = currentLocation.distanceTo(kedarnath);
        String exact_kedarnath = df.format((dist3/1000));
        kedardist.setText(exact_kedarnath+" KM");
        Location badrinath = new Location("locationE");
        badrinath.setLatitude(30.7433);
        badrinath.setLongitude(79.4938);
        double dist4 = currentLocation.distanceTo(badrinath);
        String exact_badrinath = df.format((dist4/1000));
        badridist.setText(exact_badrinath+" KM");
        locationManager.removeUpdates(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    requestLocation();
                    handler.postDelayed(this,1000);
                }
            },1000);
            requestLocation();
        }
    }

    public void requestLocation(){
        if(locationManager==null){
            locationManager=(LocationManager) getSystemService(LOCATION_SERVICE);
        }
        if(locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,1000,1000,this);
            }
        }
    }
}