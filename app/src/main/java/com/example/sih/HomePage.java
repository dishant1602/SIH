package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    CardView haridwarcard, katarmalcard, baijnathcard, pbtcard, binsarcard, jageshwarcard, dandeshwarcard, baleshwarcard, mallacard, banasurcard;
    CardView rajbhungacard, pithoragarhcard, askotcard, almoracard, simtolacard, kasarcard, mayawaticard, nainicard, damyanticard, satcard, bhimcard, khurpacard, naukuchiyacard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);

        haridwarcard=findViewById(R.id.haridwarcard);
        baijnathcard=findViewById(R.id.baijnathcard);
        katarmalcard=findViewById(R.id.katarmalcard);
        pbtcard=findViewById(R.id.pbtcard);
        binsarcard=findViewById(R.id.binsarcard);
        jageshwarcard=findViewById(R.id.jageshwarcard);
        dandeshwarcard=findViewById(R.id.dandeshwarcard);
        baleshwarcard=findViewById(R.id.baleshwarcard);
        mallacard=findViewById(R.id.mallacard);
        banasurcard=findViewById(R.id.banasurcard);
        rajbhungacard=findViewById(R.id.rajbhungacard);
        pithoragarhcard=findViewById(R.id.pithoragarhcard);
        askotcard=findViewById(R.id.askotcard);
        almoracard=findViewById(R.id.almoracard);
        simtolacard=findViewById(R.id.simtolacard);
        kasarcard=findViewById(R.id.kasarcard);
        mayawaticard=findViewById(R.id.mayawaticard);
        nainicard=findViewById(R.id.nainicard);
        damyanticard=findViewById(R.id.damyanticard);
        satcard=findViewById(R.id.satcard);
        bhimcard=findViewById(R.id.bhimcard);
        khurpacard=findViewById(R.id.khurpacard);
        naukuchiyacard=findViewById(R.id.naukuchiyacard);

        haridwarcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Haridwar\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        baijnathcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Baijnath\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        katarmalcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Katarmal\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        pbtcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Patal Bhuvaneshwar\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        binsarcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Binsar Mahadev\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        jageshwarcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Jageshwar\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        dandeshwarcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Dandeshwar\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        baleshwarcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Baleshwar\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        mallacard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Malla Mahal\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        banasurcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Banasur Fort\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        rajbhungacard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Rajbhunga Fort\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        pithoragarhcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Pithoragarh Fort\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        askotcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Askot\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        almoracard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Almora\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        simtolacard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Simtola\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        kasarcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Kasar Devi\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        mayawaticard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Mayawati\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        nainicard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Naini Lake\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        damyanticard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Nal Damayanti Tal\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        satcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Sat Tal\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        bhimcard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Bhim Tal\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        khurpacard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Khurpa Tal\uD83D\uDE42", Toast.LENGTH_SHORT).show());

        naukuchiyacard.setOnClickListener(view -> Toast.makeText(HomePage.this, "Will soon add more info about Naukuchiya Tal\uD83D\uDE42", Toast.LENGTH_SHORT).show());
    }
}