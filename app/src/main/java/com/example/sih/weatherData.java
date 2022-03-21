package com.example.sih;

import org.json.JSONException;
import org.json.JSONObject;

public class weatherData {
    private String mTemperature;
    private String maxTemp;
    private String minTemp;
    private double windSpeed;

    public static weatherData fromJson(JSONObject jsonObject)
    {

        try
        {
            weatherData weatherD=new weatherData();
            double tempResult=jsonObject.getJSONObject("main").getDouble("temp")-273.15;
            double maxResult=jsonObject.getJSONObject("main").getDouble("temp_max")-273.15;
            double minResult=jsonObject.getJSONObject("main").getDouble("temp_min")-273.15;
            weatherD.windSpeed=jsonObject.getJSONObject("wind").getDouble("speed");
            int roundedValue=(int)Math.rint(tempResult);
            int overcome=(int)Math.rint(maxResult);
            int overcome1=(int)Math.rint(minResult);
            weatherD.mTemperature=Integer.toString(roundedValue);
            weatherD.maxTemp=Integer.toString(overcome);
            weatherD.minTemp=Integer.toString(overcome1);
            return weatherD;
        }


        catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


    }
    public String getmTemperature() {
        return mTemperature+"°C";
    }
    public String getMaxTemp() {
        return maxTemp+"°C ↑";
    }

    public String getMinTemp() {
        return minTemp + "°C ↓";
    }
    public String getwindSpeed() {
        return windSpeed + "m/s";
    }
}
