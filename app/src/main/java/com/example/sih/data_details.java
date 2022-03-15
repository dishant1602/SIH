package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class data_details extends AppCompatActivity {
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_details);
        relativeLayout=findViewById(R.id.data_detailsback);
        Intent intent = getIntent();
        String str = intent.getStringExtra("key");
        if(str!=null){
            if(str=="fromyam"){
                relativeLayout.setBackgroundResource(R.drawable.yam);
            }
        }
    }
}