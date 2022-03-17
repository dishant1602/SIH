package com.example.sih;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Dialog;
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
import android.view.ViewGroup;
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
    TextView yamdist, gangdist, kedardist, badridist, hcdist, ntdist, gaurikunddist, gaumukhdist, fridist, rnpdist, hkpdist, teramanzildist, manasadist, tapkeshwardist, vyasdist, sddist, robberdist, skiingdist, gnqdist, gehdist, ltdist;
    CardView yamunotricard;
    LocationListener locationListener;
    final long MIN_TIME = 5000;
    String Location_Provider=LocationManager.GPS_PROVIDER;
    final float MIN_DISTANCE = 1000;
    Double Latitude, Longitude;
    final int REQUEST_CODE = 101;
    Dialog dialog;
    String exact_yamunotri;

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
        vyasdist=findViewById(R.id.vyasdist);
        sddist=findViewById(R.id.sddist);
        robberdist=findViewById(R.id.robberdist);
        skiingdist=findViewById(R.id.skiingdist);
        fridist = findViewById(R.id.fridist);
        rnpdist = findViewById(R.id.rnpdist);
        hcdist=findViewById(R.id.hcdist);
        ntdist=findViewById(R.id.ntdist);
        ltdist=findViewById(R.id.ltdist);
        gehdist=findViewById(R.id.gehdist);
        gnqdist=findViewById(R.id.gqndist);
        hkpdist = findViewById(R.id.hkpdist);
        manasadist = findViewById(R.id.manasadist);
        teramanzildist=findViewById(R.id.teramanzildist);
        tapkeshwardist=findViewById(R.id.tapkeshwardist);
        gaurikunddist=findViewById(R.id.gaurikunddist);
        gaumukhdist=findViewById(R.id.gaumukhdist);
        dialog = new Dialog(HomePage.this);
        dialog.setContentView(R.layout.pop_up_box);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.back_pop));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().getAttributes().windowAnimations=R.style.animation;
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
        dialog.show();
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
        dialog.dismiss();
        Log.d("mylog","Get Location"+location.getLatitude() + "," + location.getLongitude());
        Location currentLocation = new Location("locationA");
        currentLocation.setLatitude(location.getLatitude());
        currentLocation.setLongitude(location.getLongitude());
        yamdist.setText(distcalc(currentLocation, 31.01450, 78.46044)+" KM");
        gangdist.setText(distcalc(currentLocation, 31.00081, 78.92944)+" KM");
        kedardist.setText(distcalc(currentLocation, 30.76117, 79.07015)+" KM");
        badridist.setText(distcalc(currentLocation, 30.7433, 79.4938)+" KM");
        hcdist.setText(distcalc(currentLocation, 30.9324, 78.3992)+" KM");
        ntdist.setText(distcalc(currentLocation, 30.58925, 78.13903)+" KM");
        gaurikunddist.setText(distcalc(currentLocation, 30.65601, 79.02821)+" KM");
        gaumukhdist.setText(distcalc(currentLocation, 30.75402, 78.44484)+" KM");
        rnpdist.setText(distcalc(currentLocation, 29.9927, 78.2437)+" KM");
        fridist.setText(distcalc(currentLocation, 30.3438, 77.9978)+" KM");
        hkpdist.setText(distcalc(currentLocation, 29.9567, 78.1710)+" KM");
        teramanzildist.setText(distcalc(currentLocation, 30.12659, 78.33076)+" KM");
        manasadist.setText(distcalc(currentLocation, 29.9579, 78.1653)+" KM");
        tapkeshwardist.setText(distcalc(currentLocation, 30.35748, 78.01666)+" KM");
        vyasdist.setText(distcalc(currentLocation, 30.7743, 79.4949)+" KM");
        sddist.setText(distcalc(currentLocation, 30.3884, 78.1294)+" KM");
        robberdist.setText(distcalc(currentLocation, 30.3766, 78.0612)+" KM");
        skiingdist.setText(distcalc(currentLocation, 30.5305, 79.5685)+" KM");
        gehdist.setText(distcalc(currentLocation, 30.4591, 78.0229)+" KM");
        gnqdist.setText(distcalc(currentLocation, 30.08092, 78.34092)+" KM");
        ltdist.setText(distcalc(currentLocation, 30.4667, 78.0950)+" KM");
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

    private String distcalc(Location curr_func, Double lat_func, Double long_func){
        Location test_func = new Location("locc");
        test_func.setLatitude(lat_func);
        test_func.setLongitude(long_func);
        double dist14 = curr_func.distanceTo(test_func);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        String out_func = df.format((dist14/1000));
        return out_func;
    }
}