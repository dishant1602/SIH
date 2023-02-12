
## 🚀 About Me
I'm an Android Developer by Passion...  .Net Developer by Profession
# Uttarakhand Tourist Guide

A complete guide for the tourist planning to visit Uttarakhand. Built as a compettition participation in the 'Smart India Hackathon 2022'


![Logo](https://user-images.githubusercontent.com/76876581/198018252-12f0c345-f89b-4db9-9eed-ca319c811dd6.png)


## Features

- Distance of places from User's current location 
- Realtime Weather Information
- Live News and Happenings in Uttarakhand
- Realtime Hotels and Guest Houses Availability Updates
- Complete information of How to visit | Why to visit | Where to visit | When to visit


## Roadmap

- Additional browser support

- Add more integrations


## API Reference

#### Weather Info from OpenWeather API

```http
  GET https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Latitude` `Longitude` | `double` | **Required**. Your API key |

#### Current Location from Google's LocationManager API

`(LocationManager) getSystemService(LOCATION_SERVICE)`

## FAQ

#### Is the Weather Realtime?

Yes. The weather is realtime as provided by OpenWeatherAPI.

#### What all external resources are used in this app?

`LottieFiles` for Animation. `OpenWeatherAPI` for WeatherInfo. `Location Manager` for live location and distance calculation. `Custom API` for Hotels Availability hosted on ```https://www.pythonanywhere.com```.

#### What if the GPS is turned off?

Exploring the app will still be possible, only the distance from current location won't be available.


## Demo

Here's is a link to demo

[Test the App](https://appetize.io/app/xused4ar527dnmmvceul4tlhkq)


## Screenshots

![App Screenshot 1](https://user-images.githubusercontent.com/76876581/198023143-c044a089-2ce3-4461-8d4e-1a3ba202977a.jpg)

![App Screenshot 2](https://user-images.githubusercontent.com/76876581/198023345-61390abc-6de3-44af-9a23-0bc9af499e07.jpg)


![App Screenshot 3](https://user-images.githubusercontent.com/76876581/198362949-c1b4857b-3e19-4f9c-807c-34a08780d420.jpg)

