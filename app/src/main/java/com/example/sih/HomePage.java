package com.example.sih;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

public class HomePage extends AppCompatActivity{
    TextView yamdist, gangdist, kedardist, badridist;
    CardView yamunotricard;
    FusedLocationProviderClient fusedLocationProviderClient;

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
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        if(ActivityCompat.checkSelfPermission(HomePage.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
                @Override
                public void onComplete(@NonNull Task<Location> task) {
                    Location location = task.getResult();
                    if(location != null){
                        try {
                            Geocoder geocoder = new Geocoder(HomePage.this, Locale.getDefault());
                            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
                            Double j = addresses.get(0).getLatitude();
                            Double k = addresses.get(0).getLongitude();
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
                            double dist4 = currentLocation.distanceTo(kedarnath);
                            String exact_badrinath = df.format((dist4/1000));
                            kedardist.setText(exact_badrinath+" KM");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        else{
            ActivityCompat.requestPermissions(HomePage.this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},44);
        }
        yamunotricard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,DataPage.class);
                startActivity(i);
            }
        });
    }
}