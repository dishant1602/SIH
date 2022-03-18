package com.example.sih;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;

public class HomePage extends AppCompatActivity implements LocationListener {
    LocationManager locationManager;
    final static String[] PERMISSIONS = {Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION};
    final static int PERMISSIONS_ALL =1;
    TextView yamdist, gangdist, kedardist, badridist, hcdist, ntdist, gaurikunddist, gaumukhdist, fridist, rnpdist, hkpdist, teramanzildist, manasadist, tapkeshwardist, vyasdist, sddist, robberdist, skiingdist, gnqdist, gehdist, ltdist;
    CardView yamunotricard;
    CardView hccard, gaurikundcard, ntcard, gaumukhcard, rnpcard, fricard, hkpcard, tapkeshwarcard, manasacard, teramanzilcard, vyascard, robbercard, sdcard, skiingcard, gqncard, ltcard, gehcard;
    Double Latitude, Longitude;
    Dialog dialog;
    ImageView back_but;
//By default section
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);
        hkpcard=findViewById(R.id.hkpcard);
        tapkeshwarcard=findViewById(R.id.tapkeshwarcard);
        gqncard=findViewById(R.id.gqncard);
        ltcard=findViewById(R.id.ltcard);
        gehcard=findViewById(R.id.gehcard);
        manasacard=findViewById(R.id.manasacard);
        teramanzilcard=findViewById(R.id.teramanzilcard);
        vyascard=findViewById(R.id.vyascard);
        robbercard=findViewById(R.id.robbercard);
        sdcard=findViewById(R.id.sdcard);
        skiingcard=findViewById(R.id.skiingcard);
        rnpcard=findViewById(R.id.rnpcard);
        fricard=findViewById(R.id.fricard);
        yamdist = findViewById(R.id.yamdist);
        gangdist = findViewById(R.id.gangdist);
        kedardist = findViewById(R.id.kedardist);
        badridist = findViewById(R.id.badridist);
        yamunotricard=findViewById(R.id.yamunotricard);
        vyasdist=findViewById(R.id.vyasdist);
        sddist=findViewById(R.id.sddist);
        robberdist=findViewById(R.id.robberdist);
        skiingdist=findViewById(R.id.skiingdist);
        back_but=findViewById(R.id.imageView2);
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
        hccard=findViewById(R.id.hccard);
        gaurikundcard=findViewById(R.id.gaurikundcard);
        ntcard=findViewById(R.id.ntcard);
        gaumukhcard=findViewById(R.id.gaumukhcard);
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
        yamunotricard.setOnClickListener(view -> {
            Intent i = new Intent(HomePage.this,DataPage.class);
            startActivity(i);
        });
        back_but.setOnClickListener(view -> {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        });
        hccard.setOnClickListener(view -> {
            Intent hccard_int = new Intent(HomePage.this,data_details.class);
            hccard_int.putExtra("key","fromhccard");
            startActivity(hccard_int);
        });
        gaurikundcard.setOnClickListener(view -> {
            Intent gaurikundcard_int = new Intent(HomePage.this,data_details.class);
            gaurikundcard_int.putExtra("key","fromgaurikundcard");
            startActivity(gaurikundcard_int);
        });
        ntcard.setOnClickListener(view -> {
            Intent ntcard_int = new Intent(HomePage.this,data_details.class);
            ntcard_int.putExtra("key","fromntcard");
            startActivity(ntcard_int);
        });
        gaumukhcard.setOnClickListener(view -> {
            Intent gaumukhcard_int = new Intent(HomePage.this,data_details.class);
            gaumukhcard_int.putExtra("key","fromgaumukhcard");
            startActivity(gaumukhcard_int);
        });
        rnpcard.setOnClickListener(view -> {
            Intent rnpcard_int = new Intent(HomePage.this,data_details.class);
            rnpcard_int.putExtra("key","fromrnpcard");
            startActivity(rnpcard_int);
        });
        fricard.setOnClickListener(view -> {
            Intent fricard_int = new Intent(HomePage.this,data_details.class);
            fricard_int.putExtra("key","fromfricard");
            startActivity(fricard_int);
        });
        hkpcard.setOnClickListener(view -> {
            Intent hkpcard_int = new Intent(HomePage.this,data_details.class);
            hkpcard_int.putExtra("key","fromhkpcard");
            startActivity(hkpcard_int);
        });
        tapkeshwarcard.setOnClickListener(view -> {
            Intent tapkeshwarcard_int = new Intent(HomePage.this,data_details.class);
            tapkeshwarcard_int.putExtra("key","fromtapkeshwarcard");
            startActivity(tapkeshwarcard_int);
        });
        manasacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manasacard_int = new Intent(HomePage.this,data_details.class);
                manasacard_int.putExtra("key","frommanasacard");
                startActivity(manasacard_int);
            }
        });
        teramanzilcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teramanzilcard_int = new Intent(HomePage.this,data_details.class);
                teramanzilcard_int.putExtra("key","fromteramanzilcard");
                startActivity(teramanzilcard_int);
            }
        });
        vyascard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vyascard_int = new Intent(HomePage.this,data_details.class);
                vyascard_int.putExtra("key","fromvyascard");
                startActivity(vyascard_int);
            }
        });
        robbercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent robbercard_int = new Intent(HomePage.this,data_details.class);
                robbercard_int.putExtra("key","fromrobbercard");
                startActivity(robbercard_int);
            }
        });
        sdcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sdcard_int = new Intent(HomePage.this,data_details.class);
                sdcard_int.putExtra("key","fromsdcard");
                startActivity(sdcard_int);
            }
        });
        skiingcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent skiingcard_int = new Intent(HomePage.this,data_details.class);
                skiingcard_int.putExtra("key","fromskiingcard");
                startActivity(skiingcard_int);
            }
        });
        gqncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gqncard_int = new Intent(HomePage.this,data_details.class);
                gqncard_int.putExtra("key","fromgqncard");
                startActivity(gqncard_int);
            }
        });
        ltcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltcard_int = new Intent(HomePage.this,data_details.class);
                ltcard_int.putExtra("key","fromltcard");
                startActivity(ltcard_int);
            }
        });
        gehcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gehcard_int = new Intent(HomePage.this,data_details.class);
                gehcard_int.putExtra("key","fromgehcard");
                startActivity(gehcard_int);
            }
        });
    }
// For current location and to display it
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
// Requesting permission to access location
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
// Get location on approval
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
// User defined function for distance between current and set coordinates
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