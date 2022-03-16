package com.example.sih;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class data_details extends AppCompatActivity {
    RelativeLayout relativeLayout;
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_details);
        relativeLayout=findViewById(R.id.data_detailsback);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        if(value.equals("fromyam")){
                relativeLayout.setBackgroundResource(R.drawable.yam);
                textView.setText("About Yamunotri");
                textView2.setText("Dedicated to Goddess Yamuna-the goddess of perseverance, Yamunotri  temple lies in the western Garhwal Himalayas at an elevation of about 3293 meters.\n\nYamunotri temple was constructed by king of tehri, Naresh Sudarshan shah in 1839, it was reconstructed by Maharani of Jaipur Gularia devi in the 19th century AD after a massive portion of temple was damaged due to earthquake.\n\nTwin sister of Yama ( God of death ), daughter of Surya ( sun  god ) and Sandhya, Yamuna is said to be a divine goddess according to Hindu Mythology.\n\nThe temple opens on Akshay tritya ( May ) and closes on Yama Dwitiya ( the second day after Diwali , November ) for the winter.\n\nThe deity is placed at Kharsali-a town that is located at a distance of average 8.3 km from Yamunotri temple in the season of winter.\n\nYamunotri is a part of the chota chardham yatra that takes place in Uttarakhand.\n\nAs there is only trekking path available to reach Yamunotri from Jankichatti- a place that is located at the base of Yamunotri temple, Ponies , horses and Palanquins are available for the ride to the temple.\n\nYamunotri is the place with which tourists often start their chota-chardham yatra in Uttarakhand.");
        }
        if(value.equals("frombycar")){
            relativeLayout.setBackgroundResource(R.drawable.bycar);
            textView.setText("By Car details");
            textView2.setText("Yamunotri is directly not connected with motorable roads and so trekking begins at Hanuman chatti which is 14 kms away from Yamunotri temple and Janki chatti which is 6 km trek to Yamunotri temple.\n\nHanuman chatti can be reached by ISBT buses from Haridwar, Rishikesh and Dehradun. Janki chatti can be reached by taking buses from Haridwar , Rishikesh, Dehradun, etc.  till Barkot and then taking taxi for Janki chatti which is 45 kms from Barkot.\n\nJanki chatti is the ultimate place for reaching Yamunotri by trekking.");
        }
        if(value.equals("frombytrain")){
            relativeLayout.setBackgroundResource(R.drawable.bytrain);
            textView.setText("By Rail details");
            textView2.setText("The nearest Railway stations to Yamunotri are Rishikesh, Dehradun and Haridwar. Rishikesh railway station is located at average 172 kms from Yamunotri, Rishikesh Railway station is situated at 200 kms from Yamunotri and Haridwar Railway station is located at a distance of 211 km from Yamunotri.\n\nThese Railway stations are very well connected with major cities of India  and trains to Rishikesh, Haridwar and Dehradun are frequent.\n\nFrom these stations, buses and taxis are available that will take tourist up-to Barkot  and Hanuman chatti  which are located at 51 kms and 14 kms away from Yamunotri temple respectively.");
        }
        if(value.equals("frombyair")){
            relativeLayout.setBackgroundResource(R.drawable.bytrain);
            textView.setText("By Air details");
            textView2.setText("Dehradun can be reached via Jolly Grant Airport and then tourist can take helicopter from Dehradun to Kharsali.\n\nThe helicopter services are available in Shastradhara helipad Dehradun and then arrive at Kharsali with Helicopter for trekking 6 km to Yamunotri\n\nThe helicopter services offered at Sahastradhara has Rs 3,75,000 for 6 persons including tax and will take 30 minutes approximately from Sahastradhara to reach Kharsali. Himalayan Heli’s ground staff will welcome the tourists and provide them with Palki or Pony for Yamunotri trek.");
        }
    }
}