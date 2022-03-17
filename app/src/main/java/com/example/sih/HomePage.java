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
    TextView yamdist, gangdist, kedardist, badridist, hcdist, ntdist, gaurikunddist, gaumukhdist, fridist, rnpdist, hkpdist, teramanzildist, manasadist, tapkeshwardist;
    CardView yamunotricard;
    LocationListener locationListener;
    final long MIN_TIME = 5000;
    String Location_Provider=LocationManager.GPS_PROVIDER;
    final float MIN_DISTANCE = 1000;
    Double Latitude, Longitude;
    final int REQUEST_CODE = 101;
    Dialog dialog;

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
        fridist = findViewById(R.id.fridist);
        rnpdist = findViewById(R.id.rnpdist);
        hcdist=findViewById(R.id.hcdist);
        ntdist=findViewById(R.id.ntdist);
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
        Location hc = new Location("locationF");
        hc.setLatitude(30.9324);
        hc.setLongitude(78.3992);
        double dist5 = currentLocation.distanceTo(hc);
        String exact_hc = df.format((dist5/1000));
        hcdist.setText(exact_hc+" KM");
        Location nt = new Location("locationG");
        nt.setLatitude(30.58925);
        nt.setLongitude(78.13903);
        double dist6 = currentLocation.distanceTo(nt);
        String exact_nt = df.format((dist6/1000));
        ntdist.setText(exact_nt+" KM");
        Location gaurikund = new Location("locationH");
        gaurikund.setLatitude(30.65601);
        gaurikund.setLongitude(79.02821);
        double dist7 = currentLocation.distanceTo(gaurikund);
        String exact_gaurikund = df.format((dist7/1000));
        gaurikunddist.setText(exact_gaurikund+" KM");
        Location gaumukh = new Location("locationI");
        gaumukh.setLatitude(30.75402);
        gaumukh.setLongitude(78.44484);
        double dist8 = currentLocation.distanceTo(gaumukh);
        String exact_gaumukh = df.format((dist8/1000));
        gaumukhdist.setText(exact_gaumukh+" KM");
        Location rnp = new Location("locationJ");
        rnp.setLatitude(29.9927);
        rnp.setLongitude(78.2437);
        double dist9 = currentLocation.distanceTo(rnp);
        String exact_rnp = df.format((dist9/1000));
        rnpdist.setText(exact_rnp+" KM");
        Location fri = new Location("locationK");
        fri.setLatitude(30.3438);
        fri.setLongitude(77.9978);
        double dist10 = currentLocation.distanceTo(fri);
        String exact_fri = df.format((dist10/1000));
        fridist.setText(exact_fri+" KM");
        Location hkp = new Location("locationL");
        hkp.setLatitude(29.9567);
        hkp.setLongitude(78.1710);
        double dist11 = currentLocation.distanceTo(hkp);
        String exact_hkp = df.format((dist11/1000));
        hkpdist.setText(exact_hkp+" KM");
        Location teramanzil = new Location("locationM");
        teramanzil.setLatitude(30.12659);
        teramanzil.setLongitude(78.33076);
        double dist12 = currentLocation.distanceTo(teramanzil);
        String exact_teramanzil = df.format((dist12/1000));
        teramanzildist.setText(exact_teramanzil+" KM");
        Location manasa = new Location("locationN");
        manasa.setLatitude(30.12659);
        manasa.setLongitude(78.33076);
        double dist13 = currentLocation.distanceTo(manasa);
        String exact_manasa = df.format((dist13/1000));
        manasadist.setText(exact_manasa+" KM");
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