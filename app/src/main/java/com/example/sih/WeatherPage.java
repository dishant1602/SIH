package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.LocationManager;
import android.location.LocationListener;
import android.os.Bundle;
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
    TextView x_curr, x_max, x_min, x_wind, textView17;
    Button yam_but, gangotri_button, kedarnath_button, badrinath_button, hc_button, gaurikund_button, nt_button, gaumukh_button, rnp_button, fri_button, hkp_button, tapkeshwar_button, manasa_button, teramanzil_button, vyas_button, robber_button, sd_button, skiing_button, gqn_button, lt_button, geh_button, close_weathinfo;
    Double Latitude=null;
    Double Longitude=null;
    Boolean sidecond=false;
    LinearLayout weatherdisp, sidemenu_weatherpage, tncwop, faqwop, aboutuswop, precwop, disasterwop;
    ImageView weatherpage_home, weatherpage_menu, weatherpage_hotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_weather_page);
        sidemenu_weatherpage=findViewById(R.id.sidemenu_weatherpage);
        tncwop=findViewById(R.id.tncwop);
        aboutuswop=findViewById(R.id.aboutuswop);
        faqwop=findViewById(R.id.faqwop);
        precwop=findViewById(R.id.precwop);
        disasterwop=findViewById(R.id.disasterwop);
        weatherpage_home=findViewById(R.id.weatherpage_home);
        weatherpage_hotel=findViewById(R.id.weatherpage_hotel);
        weatherpage_menu=findViewById(R.id.weatherpage_menu);
        x_curr=findViewById(R.id.x_curr);
        weatherdisp=findViewById(R.id.weatherdisp);
        close_weathinfo=findViewById(R.id.close_weathinfo);
        textView17=findViewById(R.id.textView17);
        x_max=findViewById(R.id.x_max);
        x_min=findViewById(R.id.x_min);
        x_wind=findViewById(R.id.x_wind);
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
        weatherdisp.setVisibility(View.GONE);
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
                    weatherpage_menu.setImageResource(R.drawable.ic_menu_unsel);
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
        close_weathinfo.setOnClickListener(view -> weatherdisp.setVisibility(View.GONE));
        yam_but.setOnClickListener(view -> {
            textView17.setText("Yamunotri");
            Latitude=31.01450;
            Longitude=78.46044;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        gangotri_button.setOnClickListener(view -> {
            textView17.setText("Gangotri");
            Latitude=31.00081;
            Longitude=78.92944;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        kedarnath_button.setOnClickListener(view -> {
            textView17.setText("Kedarnath");
            Latitude=30.76117;
            Longitude=79.07015;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        badrinath_button.setOnClickListener(view -> {
            textView17.setText("Badrinath");
            Latitude=30.7433;
            Longitude=79.4938;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        hc_button.setOnClickListener(view -> {
            textView17.setText("Hanuman Chatti -  Janki Chatti");
            Latitude=30.9324;
            Longitude=78.3992;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        nt_button.setOnClickListener(view -> {
            textView17.setText("Nag Tibba");
            Latitude=30.58925;
            Longitude=78.13903;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        gaurikund_button.setOnClickListener(view -> {
            textView17.setText("Gaurikund - Kedarnath");
            Latitude=30.65601;
            Longitude=79.02821;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        gaumukh_button.setOnClickListener(view -> {
            textView17.setText("Gaumukh Trek");
            Latitude=30.75402;
            Longitude=78.44484;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        rnp_button.setOnClickListener(view -> {
            textView17.setText("Rajaji National Museum");
            Latitude=29.9927;
            Longitude=78.2437;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        fri_button.setOnClickListener(view -> {
            textView17.setText("FRI Museum");
            Latitude=30.3438;
            Longitude=77.9978;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        hkp_button.setOnClickListener(view -> {
            textView17.setText("Har ki Pauri");
            Latitude=29.9567;
            Longitude=78.1710;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        teramanzil_button.setOnClickListener(view -> {
            textView17.setText("Tera Manzil Mandir");
            Latitude=30.12659;
            Longitude=78.33076;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        manasa_button.setOnClickListener(view -> {
            textView17.setText("Manasa Devi Temple");
            Latitude=29.9579;
            Longitude=78.1653;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        tapkeshwar_button.setOnClickListener(view -> {
            textView17.setText("Tapkeshwar Temple");
            Latitude=30.35748;
            Longitude=78.01666;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        vyas_button.setOnClickListener(view -> {
            textView17.setText("Vyas Gufa");
            Latitude=30.7743;
            Longitude=79.4949;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        sd_button.setOnClickListener(view -> {
            textView17.setText("Sahastradhara");
            Latitude=30.3884;
            Longitude=78.1294;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        robber_button.setOnClickListener(view -> {
            textView17.setText("Robbers Cave");
            Latitude=30.3766;
            Longitude=78.0612;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        skiing_button.setOnClickListener(view -> {
            textView17.setText("Auli");
            Latitude=30.5305;
            Longitude=79.5685;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        geh_button.setOnClickListener(view -> {
            textView17.setText("George Everest House");
            Latitude=30.4591;
            Longitude=78.0229;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        gqn_button.setOnClickListener(view -> {
            textView17.setText("Garhwal Queen Nilkanth");
            Latitude=30.08092;
            Longitude=78.34092;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
        });
        lt_button.setOnClickListener(view -> {
            textView17.setText("Lal Tibba");
            Latitude=30.4667;
            Longitude=78.0950;
            weatherdisp.setVisibility(View.VISIBLE);
            getweatherforxloc();
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

        x_curr.setText(weather.getmTemperature());
        x_min.setText(weather.getMinTemp());
        x_max.setText(weather.getMaxTemp());
        x_wind.setText(weather.getwindSpeed());

    }
}