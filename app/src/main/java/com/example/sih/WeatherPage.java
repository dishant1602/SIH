package com.example.sih;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class WeatherPage extends AppCompatActivity {
    final String APP_ID = "dab3af44de7d24ae7ff86549334e45bd";
    final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather";
    TextView textView9, textView11, textView12, textView14, textView16, textView19, textView20, textView21, textView22;
    CardView yam_but, gangotri_button, kedarnath_button, badrinath_button, hc_button, gaurikund_button, nt_button, gaumukh_button, rnp_button, fri_button, hkp_button, tapkeshwar_button, manasa_button, teramanzil_button, vyas_button, robber_button, sd_button, skiing_button, gqn_button, lt_button, geh_button;
    Double Latitude=null;
    Double Longitude=null;
    Boolean sidecond=false;
    LinearLayout sidemenu_weatherpage, tncwop, faqwop, aboutuswop, precwop, disasterwop;
    ImageView weatherpage_home, weatherpage_menu, weatherpage_hotel, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_weather_page);
        textView14=findViewById(R.id.textView14);
        textView16=findViewById(R.id.textView16);
        textView19=findViewById(R.id.textView19);
        textView20=findViewById(R.id.textView20);
        textView21=findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);
        sidemenu_weatherpage=findViewById(R.id.sidemenu_weatherpage);
        tncwop=findViewById(R.id.tncwop);
        aboutuswop=findViewById(R.id.aboutuswop);
        faqwop=findViewById(R.id.faqwop);
        precwop=findViewById(R.id.precwop);
        disasterwop=findViewById(R.id.disasterwop);
        weatherpage_home=findViewById(R.id.weatherpage_home);
        weatherpage_hotel=findViewById(R.id.weatherpage_hotel);
        weatherpage_menu=findViewById(R.id.weatherpage_menu);
        yam_but=findViewById(R.id.yam_but);
        gangotri_button=findViewById(R.id.gangotri_button);
        kedarnath_button=findViewById(R.id.kedarnath_button);
        badrinath_button=findViewById(R.id.badrinath_button);
        hc_button=findViewById(R.id.hc_button);
        gaurikund_button=findViewById(R.id.gaurikund_button);
        nt_button=findViewById(R.id.nt_button);
        gaumukh_button=findViewById(R.id.gaumukh_button);
        rnp_button=findViewById(R.id.rnp_button);
        fri_button=findViewById(R.id.fri_button);
        hkp_button=findViewById(R.id.hkp_button);
        tapkeshwar_button=findViewById(R.id.tapkeshwar_button);
        manasa_button=findViewById(R.id.manasa_button);
        teramanzil_button=findViewById(R.id.teramanzil_button);
        vyas_button=findViewById(R.id.vyas_button);
        robber_button=findViewById(R.id.robber_button);
        sd_button=findViewById(R.id.sd_button);
        skiing_button=findViewById(R.id.skiing_button);
        gqn_button=findViewById(R.id.gqn_button);
        lt_button=findViewById(R.id.lt_button);
        geh_button=findViewById(R.id.geh_button);
        textView9=findViewById(R.id.textView9);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        imageView2=findViewById(R.id.imageView2);
        weatherpage_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Weather_Home = new Intent(WeatherPage.this,HomePage.class);
                startActivity(Weather_Home);
            }
        });
        weatherpage_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Weather_Hotel = new Intent(WeatherPage.this,HotelPage.class);
                startActivity(Weather_Hotel);
            }
        });
        weatherpage_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!sidecond){
                    weatherpage_menu.setImageResource(R.drawable.ic_menu_sel);
                    sidemenu_weatherpage.setVisibility(View.VISIBLE);
                    sidecond=true;
                }
                else{
                    weatherpage_menu.setImageResource(R.drawable.ic_menu_unsel_updated);
                    sidemenu_weatherpage.setVisibility(View.GONE);
                    sidecond=false;
                }
            }
        });
        precwop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent precfromweather = new Intent(WeatherPage.this, mergedwebview.class);
                precfromweather.putExtra("spacex","precwhi");
                startActivity(precfromweather);
            }
        });
        tncwop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tncfromweather = new Intent(WeatherPage.this, mergedwebview.class);
                tncfromweather.putExtra("spacex","tncwhi");
                startActivity(tncfromweather);
            }
        });
        faqwop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent faqfromweather = new Intent(WeatherPage.this, mergedwebview.class);
                faqfromweather.putExtra("spacex","faqwhi");
                startActivity(faqfromweather);
            }
        });
        aboutuswop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutusfromweather = new Intent(WeatherPage.this, mergedwebview.class);
                aboutusfromweather.putExtra("spacex","aboutuswhi");
                startActivity(aboutusfromweather);
            }
        });
        disasterwop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disfromweather = new Intent(WeatherPage.this, mergedwebview.class);
                disfromweather.putExtra("spacex","diswhi");
                startActivity(disfromweather);
            }
        });
        yam_but.setOnClickListener(view -> {
            textView11.setText("Yamunotri");
            Latitude=31.01450;
            Longitude=78.46044;
            getweatherforxloc();
            cardbackgroundcolor(yam_but);
        });
        gangotri_button.setOnClickListener(view -> {
            textView11.setText("Gangotri");
            Latitude=31.00081;
            Longitude=78.92944;
            getweatherforxloc();
            cardbackgroundcolor(gangotri_button);
        });
        kedarnath_button.setOnClickListener(view -> {
            textView11.setText("Kedarnath");
            Latitude=30.76117;
            Longitude=79.07015;
            getweatherforxloc();
            cardbackgroundcolor(kedarnath_button);
        });
        badrinath_button.setOnClickListener(view -> {
            textView11.setText("Badrinath");
            Latitude=30.7433;
            Longitude=79.4938;
            getweatherforxloc();
            cardbackgroundcolor(badrinath_button);
        });
        hc_button.setOnClickListener(view -> {
            textView11.setText("Hanuman Chatti -  Janki Chatti");
            Latitude=30.9324;
            Longitude=78.3992;
            getweatherforxloc();
            cardbackgroundcolor(hc_button);
        });
        nt_button.setOnClickListener(view -> {
            textView11.setText("Nag Tibba");
            Latitude=30.58925;
            Longitude=78.13903;
            getweatherforxloc();
            cardbackgroundcolor(nt_button);
        });
        gaurikund_button.setOnClickListener(view -> {
            textView11.setText("Gaurikund - Kedarnath");
            Latitude=30.65601;
            Longitude=79.02821;
            getweatherforxloc();
            cardbackgroundcolor(gaurikund_button);
        });
        gaumukh_button.setOnClickListener(view -> {
            textView11.setText("Gaumukh Trek");
            Latitude=30.75402;
            Longitude=78.44484;
            getweatherforxloc();
            cardbackgroundcolor(gaumukh_button);
        });
        rnp_button.setOnClickListener(view -> {
            textView11.setText("Rajaji National Museum");
            Latitude=29.9927;
            Longitude=78.2437;
            getweatherforxloc();
            cardbackgroundcolor(rnp_button);
        });
        fri_button.setOnClickListener(view -> {
            textView11.setText("FRI Museum");
            Latitude=30.3438;
            Longitude=77.9978;
            getweatherforxloc();
            cardbackgroundcolor(fri_button);
        });
        hkp_button.setOnClickListener(view -> {
            textView11.setText("Har ki Pauri");
            Latitude=29.9567;
            Longitude=78.1710;
            getweatherforxloc();
            cardbackgroundcolor(hkp_button);
        });
        teramanzil_button.setOnClickListener(view -> {
            textView11.setText("Tera Manzil Mandir");
            Latitude=30.12659;
            Longitude=78.33076;
            getweatherforxloc();
            cardbackgroundcolor(teramanzil_button);
        });
        manasa_button.setOnClickListener(view -> {
            textView11.setText("Manasa Devi Temple");
            Latitude=29.9579;
            Longitude=78.1653;
            getweatherforxloc();
            cardbackgroundcolor(manasa_button);
        });
        tapkeshwar_button.setOnClickListener(view -> {
            textView11.setText("Tapkeshwar Temple");
            Latitude=30.35748;
            Longitude=78.01666;
            getweatherforxloc();
            cardbackgroundcolor(tapkeshwar_button);
        });
        vyas_button.setOnClickListener(view -> {
            textView11.setText("Vyas Gufa");
            Latitude=30.7743;
            Longitude=79.4949;
            getweatherforxloc();
            cardbackgroundcolor(vyas_button);
        });
        sd_button.setOnClickListener(view -> {
            textView11.setText("Sahastradhara");
            Latitude=30.3884;
            Longitude=78.1294;
            getweatherforxloc();
            cardbackgroundcolor(sd_button);
        });
        robber_button.setOnClickListener(view -> {
            textView11.setText("Robbers Cave");
            Latitude=30.3766;
            Longitude=78.0612;
            getweatherforxloc();
            cardbackgroundcolor(robber_button);
        });
        skiing_button.setOnClickListener(view -> {
            textView11.setText("Auli");
            Latitude=30.5305;
            Longitude=79.5685;
            getweatherforxloc();
            cardbackgroundcolor(skiing_button);
        });
        geh_button.setOnClickListener(view -> {
            textView11.setText("George Everest House");
            Latitude=30.4591;
            Longitude=78.0229;
            getweatherforxloc();
            cardbackgroundcolor(geh_button);
        });
        gqn_button.setOnClickListener(view -> {
            textView11.setText("Garhwal Queen Nilkanth");
            Latitude=30.08092;
            Longitude=78.34092;
            getweatherforxloc();
            cardbackgroundcolor(gqn_button);
        });
        lt_button.setOnClickListener(view -> {
            textView11.setText("Lal Tibba");
            Latitude=30.4667;
            Longitude=78.0950;
            getweatherforxloc();
            cardbackgroundcolor(lt_button);
        });
    }
    private void getweatherforxloc() {
        RequestParams params = new RequestParams();
        if(Latitude!=null && Longitude!=null){
            params.put("lat", Latitude);
            params.put("lon", Longitude);
            params.put("appid", APP_ID);
            letsdoSomeNetworking(params);
        }
    }
    private  void letsdoSomeNetworking(RequestParams params)
    {
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(WEATHER_URL,params,new JsonHttpResponseHandler()
        {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                //super.onSuccess(statusCode, headers, response);
                weatherData weatherD=weatherData.fromJson(response);
                updateUI(weatherD);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                //super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });



    }
    private  void updateUI(weatherData weather){

        textView9.setText(weather.getmTemperature());
        textView12.setText(weather.getMaint());
        Log.d("abc",weather.getMicon());
        int resourID=getResources().getIdentifier(weather.getMicon(),"drawable",getPackageName());
        imageView2.setImageResource(resourID);
        textView14.setText(weather.getwindSpeed());
        textView16.setText(weather.getMhumidity());
        textView19.setText(weather.getmClouds());
        textView20.setText(weather.getSunRise());
        textView21.setText(weather.getmPressure());
        textView22.setText(weather.getSunSet());

    }

    private void cardbackgroundcolor(CardView h){
        yam_but.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        gangotri_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        kedarnath_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        badrinath_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        hc_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        gaurikund_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        nt_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        gaumukh_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        rnp_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        fri_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        hkp_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        tapkeshwar_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        manasa_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        teramanzil_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        vyas_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        robber_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        sd_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        skiing_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        gqn_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        lt_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        geh_button.setCardBackgroundColor(Color.parseColor("#F8FAFE"));
        h.setCardBackgroundColor(Color.parseColor("#2ABAFF"));
    }
}