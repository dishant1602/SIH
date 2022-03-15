package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DataPage extends AppCompatActivity {
    ImageView yam, suryakund, taptkund, divyashila;
    TextView bycar,byair,bytrain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_page);
        yam=findViewById(R.id.yam);
        bycar=findViewById(R.id.bycar);
        byair=findViewById(R.id.byair);
        bytrain=findViewById(R.id.byrail);
        suryakund=findViewById(R.id.suryakund);
        taptkund=findViewById(R.id.taptkund);
        divyashila=findViewById(R.id.divyashila);
        String h = "fromyam";

        yam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yam_int = new Intent(DataPage.this, data_details.class);
                yam_int.putExtra("key",h);
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


    }
}