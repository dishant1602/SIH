package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HotelPage extends AppCompatActivity{

    String[] items={"Yamunotri","Gangotri","Badrinath","Kedarnath","Mussoorie","Dehradun","Rishikesh","Haridwar"};
    Boolean sidecond=false;
    AutoCompleteTextView autoCompleteTextView;
    LinearLayout sidemenu_hotelpage, gangotri_list, yamunotri_list, kedarnath_list, badrinath_list, mussoorie_list, rishikesh_list, dehradun_list, haridwar_list;
    ArrayAdapter<String> adapterItems;
    ImageView hotelpage_home, hotelpage_weather, hotelpage_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_page);
        gangotri_list=findViewById(R.id.gangotri_list);
        yamunotri_list=findViewById(R.id.yamunotri_list);
        kedarnath_list=findViewById(R.id.kedarnath_list);
        badrinath_list=findViewById(R.id.badrinath_list);
        mussoorie_list=findViewById(R.id.mussoorie_list);
        rishikesh_list=findViewById(R.id.rishikesh_list);
        dehradun_list=findViewById(R.id.dehradun_list);
        haridwar_list=findViewById(R.id.haridwar_list);
        hotelpage_home=findViewById(R.id.hotelpage_home);
        sidemenu_hotelpage=findViewById(R.id.sidemenu_hotelpage);
        hotelpage_menu=findViewById(R.id.hotelpage_menu);
        hotelpage_weather=findViewById(R.id.hotelpage_weather);
        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);

        adapterItems = new ArrayAdapter<String>(this,R.layout.dropdown_item,items);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                if(item.equals("Yamunotri")){
                    yamunotri_list.setVisibility(View.VISIBLE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.GONE);
                }
                if(item.equals("Gangotri")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.VISIBLE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.GONE);
                }
                if(item.equals("Badrinath")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.VISIBLE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.GONE);
                }
                if(item.equals("Kedarnath")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.VISIBLE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.GONE);
                }
                if(item.equals("Mussoorie")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.VISIBLE);
                    dehradun_list.setVisibility(View.GONE);
                }
                if(item.equals("Dehradun")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.VISIBLE);
                }
                if(item.equals("Rishikesh")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.VISIBLE);
                    haridwar_list.setVisibility(View.GONE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.GONE);
                }
                if(item.equals("Haridwar")){
                    yamunotri_list.setVisibility(View.GONE);
                    gangotri_list.setVisibility(View.GONE);
                    kedarnath_list.setVisibility(View.GONE);
                    badrinath_list.setVisibility(View.GONE);
                    rishikesh_list.setVisibility(View.GONE);
                    haridwar_list.setVisibility(View.VISIBLE);
                    mussoorie_list.setVisibility(View.GONE);
                    dehradun_list.setVisibility(View.GONE);
                }
            }
        });
        hotelpage_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Hotel_Home = new Intent(HotelPage.this, HomePage.class);
                startActivity(Hotel_Home);
            }
        });
        hotelpage_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Hotel_Weather = new Intent(HotelPage.this, WeatherPage.class);
                startActivity(Hotel_Weather);
            }
        });
        hotelpage_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!sidecond){
                    hotelpage_menu.setImageResource(R.drawable.ic_menu_sel);
                    sidemenu_hotelpage.setVisibility(View.VISIBLE);
                    sidecond=true;
                }
                else{
                    hotelpage_menu.setImageResource(R.drawable.ic_menu_unsel);
                    sidemenu_hotelpage.setVisibility(View.GONE);
                    sidecond=false;
                }
            }
        });
    }
}