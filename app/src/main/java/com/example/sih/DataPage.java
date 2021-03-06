package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DataPage extends AppCompatActivity {
    ImageView yam, time_yam, datapage_home, datapage_weather;
    TextView bycar,byair,bytrain, suryakund, taptkund, jankichatti, divyashila, hanumanchatti, kharsali, shanidevmandir;
    LinearLayout prechop, faqhop, tnchop, aboutushop, sidemenu_datapage, disasterhop;
    ImageView datapage_menu;
    Boolean sidecond=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_data_page);
        prechop=findViewById(R.id.prechop);
        faqhop=findViewById(R.id.faqhop);
        disasterhop=findViewById(R.id.disasterhop);
        sidemenu_datapage=findViewById(R.id.sidemenu_datapage);
        datapage_menu=findViewById(R.id.datapage_menu);
        tnchop=findViewById(R.id.tnchop);
        aboutushop=findViewById(R.id.aboutushop);
        yam=findViewById(R.id.yam);
        datapage_weather=findViewById(R.id.datapage_weather);
        datapage_home=findViewById(R.id.datapage_home);
        bycar=findViewById(R.id.bycar);
        byair=findViewById(R.id.byair);
        time_yam=findViewById(R.id.time);
        hanumanchatti=findViewById(R.id.hanumanchatti);
        kharsali=findViewById(R.id.kharsali);
        shanidevmandir=findViewById(R.id.shanidevmandir);
        bytrain=findViewById(R.id.byrail);
        suryakund=findViewById(R.id.suryakund);
        taptkund=findViewById(R.id.taptkund);
        divyashila=findViewById(R.id.divyashila);
        jankichatti=findViewById(R.id.jankichatti);

        datapage_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Data_Home = new Intent(DataPage.this,HomePage.class);
                startActivity(Data_Home);
            }
        });
        datapage_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Data_Weather = new Intent(DataPage.this, WeatherPage.class);
                startActivity(Data_Weather);
            }
        });

        yam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yam_int = new Intent(DataPage.this, data_details.class);
                yam_int.putExtra("key","fromyam");
                startActivity(yam_int);
            }
        });

        bycar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bycar_int = new Intent(DataPage.this, data_details.class);
                bycar_int.putExtra("key","frombycar");
                startActivity(bycar_int);
            }
        });

        byair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent byair_int = new Intent(DataPage.this, data_details.class);
                byair_int.putExtra("key","frombyair");
                startActivity(byair_int);
            }
        });

        bytrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bytrain_int = new Intent(DataPage.this, data_details.class);
                bytrain_int.putExtra("key","frombytrain");
                startActivity(bytrain_int);
            }
        });

        suryakund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suryakund_int = new Intent(DataPage.this, data_details.class);
                suryakund_int.putExtra("key","fromsuryakund");
                startActivity(suryakund_int);
            }
        });

        taptkund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent taptkund_int = new Intent(DataPage.this, data_details.class);
                taptkund_int.putExtra("key","fromtaptkund");
                startActivity(taptkund_int);
            }
        });

        divyashila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent divyashila_int = new Intent(DataPage.this, data_details.class);
                divyashila_int.putExtra("key","fromdivyashila");
                startActivity(divyashila_int);
            }
        });

        time_yam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent time_yam_int = new Intent(DataPage.this, data_details.class);
                time_yam_int.putExtra("key","fromtime_yam");
                startActivity(time_yam_int);
            }
        });

        hanumanchatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hanumanchatti_int = new Intent(DataPage.this, data_details.class);
                hanumanchatti_int.putExtra("key","fromhanumanchatti");
                startActivity(hanumanchatti_int);
            }
        });

        kharsali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kharsali_int = new Intent(DataPage.this, data_details.class);
                kharsali_int.putExtra("key","fromkharsali");
                startActivity(kharsali_int);
            }
        });

        shanidevmandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shanidevmandir_int = new Intent(DataPage.this, data_details.class);
                shanidevmandir_int.putExtra("key","fromshanidevmandir");
                startActivity(shanidevmandir_int);
            }
        });

        jankichatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jankichatti_int = new Intent(DataPage.this, data_details.class);
                jankichatti_int.putExtra("key","fromjankichatti");
                startActivity(jankichatti_int);
            }
        });

        datapage_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!sidecond){
                    datapage_menu.setImageResource(R.drawable.ic_menu_sel);
                    sidemenu_datapage.setVisibility(View.VISIBLE);
                    sidecond=true;
                }
                else{
                    datapage_menu.setImageResource(R.drawable.ic_menu_unsel);
                    sidemenu_datapage.setVisibility(View.GONE);
                    sidecond=false;
                }
            }
        });

        tnchop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tncfromdatapage = new Intent(DataPage.this, mergedwebview.class);
                tncfromdatapage.putExtra("spacex","tncshi");
                startActivity(tncfromdatapage);
            }
        });

        faqhop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent faqfromdatapage = new Intent(DataPage.this, mergedwebview.class);
                faqfromdatapage.putExtra("spacex","faqshi");
                startActivity(faqfromdatapage);
            }
        });

        aboutushop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutusfromdatapage = new Intent(DataPage.this, mergedwebview.class);
                aboutusfromdatapage.putExtra("spacex","aboutusshi");
                startActivity(aboutusfromdatapage);
            }
        });

        prechop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent precfromdata = new Intent(DataPage.this, mergedwebview.class);
                precfromdata.putExtra("spacex","precshi");
                startActivity(precfromdata);
            }
        });
        disasterhop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disfromdata = new Intent(DataPage.this, mergedwebview.class);
                disfromdata.putExtra("spacex","disshi");
                startActivity(disfromdata);
            }
        });



    }
}