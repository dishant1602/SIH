package com.example.sih;

import android.icu.text.SimpleDateFormat;
import android.os.Build;

import androidx.annotation.RequiresApi;

import org.json.JSONException;
import org.json.JSONObject;

public class weatherData {
    private String mTemperature;
    private String sunRise,micon,sunSet;
    private String maint;
    private String mHumidity, mClouds, mPressure;
    private double windSpeed;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static weatherData fromJson(JSONObject jsonObject)
    {

        try
        {
            weatherData weatherD=new weatherData();
            //Temperature
            double tempResult=jsonObject.getJSONObject("main").getDouble("temp")-273.15;
            int roundedValue=(int)Math.rint(tempResult);
            weatherD.mTemperature=Integer.toString(roundedValue);
            //Sunrise
            Long sunriseResult=jsonObject.getJSONObject("sys").getLong("sunrise");
            SimpleDateFormat srf = new SimpleDateFormat("HH:mm:ss");
            weatherD.sunRise = srf.format(new java.util.Date (sunriseResult*1000));
            //Sunset
            Long sunsetResult=jsonObject.getJSONObject("sys").getLong("sunset");
            SimpleDateFormat ssf = new SimpleDateFormat("HH:mm:ss");
            weatherD.sunSet = ssf.format(new java.util.Date (sunsetResult*1000));
            //Weather icon
            String icon = jsonObject.getJSONArray("weather").getJSONObject(0).getString("icon");
            weatherD.micon=updateWeathericon(icon);
            //Windspeed
            weatherD.windSpeed=jsonObject.getJSONObject("wind").getDouble("speed");
            //Main(clear,clouds,thunderstorm,etc)
            weatherD.maint=jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            //Humidity
            int hum = jsonObject.getJSONObject("main").getInt("humidity");
            weatherD.mHumidity = Integer.toString(hum);
            //Pressure
            int press = jsonObject.getJSONObject("main").getInt("pressure");
            weatherD.mPressure = Integer.toString(press);
            //Clouds
            int cloudss = jsonObject.getJSONObject("clouds").getInt("all");
            weatherD.mClouds = Integer.toString(cloudss);
            return weatherD;
        }


        catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


    }

    private static String updateWeathericon(String j){
        if (j.equals("01d")){
            return "d_clear";
        }

        else if (j.equals("11d")){
            return "d_thunder";
        }
        else if (j.equals("09d") || j.equals("10d")){
            return "d_rain";
        }
        else if (j.equals("13d")){
            return "d_snow";
        }
        else if (j.equals("02d") || j.equals("03d") || j.equals("04d")){
            return "d_clouds";
        }
        else if (j.equals("01n")){
            return "n_clear";
        }
        else if (j.equals("11n")){
            return "n_thunder";
        }
        else if (j.equals("09n") || j.equals("10n")){
            return "n_rain";
        }
        else if (j.equals("13n")){
            return "n_snow";
        }
        else if (j.equals("02n") || j.equals("03n") || j.equals("04n")){
            return "n_clouds";
        }
        return "d_clear";
    }
    public String getmTemperature() {
        return mTemperature+"°C";
    }
    public String getSunRise() {
        return sunRise;
    }
    public String getSunSet() {
        return sunSet;
    }

    public String getMaint() {
        return maint;
    }
    public String getwindSpeed() {
        return windSpeed + "m/s";
    }
    public String getMicon(){
        return micon;
    }
    public String getMhumidity(){
        return mHumidity;
    }
    public String getmClouds(){
        return mClouds;
    }
    public String getmPressure(){
        return mPressure;
    }
}
