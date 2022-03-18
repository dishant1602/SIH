package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DataPage extends AppCompatActivity {
    ImageView yam, back_butt, time_yam;
    TextView bycar,byair,bytrain, suryakund, taptkund, jankichatti, divyashila, hanumanchatti, kharsali, shanidevmandir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_page);
        yam=findViewById(R.id.yam);
        back_butt = findViewById(R.id.imageView7);
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

        back_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_int = new Intent(DataPage.this,HomePage.class);
                startActivity(back_int);
                finish();
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


    }
}