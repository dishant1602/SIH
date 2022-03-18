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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class data_details extends AppCompatActivity {
    TextView textView, textView2, textView4;
    ImageView imageView5, back_buto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_details);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        imageView5=findViewById(R.id.imageView5);
        back_buto=findViewById(R.id.imageView8);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        back_buto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((value.equals("fromhccard")) || (value.equals("fromgaurikundcard")) || (value.equals("fromntcard")) || (value.equals("fromgaumukhcard")) || (value.equals("fromrnpcard")) || (value.equals("fromfricard")) || (value.equals("fromhkpcard")) || )
                Intent intent1 = new Intent(data_details.this,DataPage.class);
                startActivity(intent1);
                finish();
            }
        });
        if(value.equals("fromyam")){
                imageView5.setImageResource(R.drawable.yam);
                textView4.setText("Yamunotri");
                textView.setText("About");
                textView2.setText("Dedicated to Goddess Yamuna-the goddess of perseverance, Yamunotri  temple lies in the western Garhwal Himalayas at an elevation of about 3293 meters.\n\nYamunotri temple was constructed by king of tehri, Naresh Sudarshan shah in 1839, it was reconstructed by Maharani of Jaipur Gularia devi in the 19th century AD after a massive portion of temple was damaged due to earthquake.\n\nTwin sister of Yama ( God of death ), daughter of Surya ( sun  god ) and Sandhya, Yamuna is said to be a divine goddess according to Hindu Mythology.\n\nThe temple opens on Akshay tritya ( May ) and closes on Yama Dwitiya ( the second day after Diwali , November ) for the winter.\n\nThe deity is placed at Kharsali-a town that is located at a distance of average 8.3 km from Yamunotri temple in the season of winter.\n\nYamunotri is a part of the chota chardham yatra that takes place in Uttarakhand.\n\nAs there is only trekking path available to reach Yamunotri from Jankichatti- a place that is located at the base of Yamunotri temple, Ponies , horses and Palanquins are available for the ride to the temple.\n\nYamunotri is the place with which tourists often start their chota-chardham yatra in Uttarakhand.");
        }
        if(value.equals("fromhccard")){
            imageView5.setImageResource(R.drawable.hc);
            textView4.setText("Hanuman Chatti-Janki Chatti");
            textView.setText("About");
            textView2.setText("Situated at a distance of 14 kms from Yamunotri it is a serene place and provides ample amount of accommodation facilities.\n\nIt is a frequently used by travelers as it is popular trekking spot in the region\n\nOne can purchase Medicines, Raincoats and other necessary items at Hanuman Chatti.\n\nOne can reach Hanuman Chatti from Barkot by traveling in Jeep and then trekking for Yamunotri begins from here.\n\nIt is considered as one of the best trekking Place for Trek Lovers.\n\nThere are two treks further possible from Hanuman chatti with less distance and one can further reach to Janki chatti from Hanuman chatti. Then, perform trek from Janki chatti to Yamunotri which is 6kms trek.");
        }
        if(value.equals("fromgaurikundcard")){
            imageView5.setImageResource(R.drawable.gaurikund);
            textView4.setText("Gaurikund-Kedarnath");
            textView.setText("About");
            textView2.setText("The trek to Kedarnath starts from Gauri Kund and this trek is 16 kms.\n\nThis trek is one of the most favourite treks among the trek lovers.\n\nThis trek contains places to rest, eat and it is full of serenity and waterfalls found frequently along the path.\n\nIt usually takes 6-7 hours to complete this 16 km trek and it is recommended to carry Raincoat, Wolen clothes along side the journey, as the weather changes anytime in this place.\n\nDuring the trek places like Jungle chatti, Bheembali and Linchauli have ample amount of foodstuff  facilities.\n\nAlso, there is a base camp at the distance of 1 km from Kedarnath temple there are very good accommodation facilities provided by GMVN (Garhwal Mandal Vikas Nigam).");
        }
        if(value.equals("fromntcard")){
            imageView5.setImageResource(R.drawable.nt);
            textView4.setText("Nag Tibba");
            textView.setText("About");
            textView2.setText("For an alluring trekking destination for trek lovers, Nag Tibba is  perfectly suitable for beginners and children, poses no threat of altitude sickness and offers a thoroughly enlivening trek instead.\n\nIt is located at an altitude of 9915 ft and offers a stunning view of Gangotri peaks, Bandarpoonch peak and Kedarnath peak to arrest the attention of visitors.\n\nApproximate trekking distance is 16km.\n\nIn Summer, you will be greeted with summer blossoms and the winter season offers the trek lovers with abundance of snow.\n\nIt starts from Pantwari, a quiet hamlet in the vicinity of Dehradun-Mussoorie, the trek begins up a rocky ascent and after a couple of hours on the trail, enters the grove of oaks and rhododendrons.\n\nThere is a camp down the Naga Tibba where trek lovers often reside during the night and often start trek in the early morning.");
        }
        if(value.equals("fromgaumukhcard")){
            imageView5.setImageResource(R.drawable.gaumukh);
            textView4.setText("Gaumukh Trek");
            textView.setText("About");
            textView2.setText("One of the most popular and rewarding treks in the Garhwal Himalayas, Gaumukh-Tapovan-Nanadanvan circuit not only gives you the opportunity to camp at the foot of lofty Himalayan peaks but it also involves crossing the massive Gaumukh  Glacier, the origin of Ganga River.\n\nThe trail to Gaumukh is open for trekkers and pilgrims from May to October.\n\nTo visit the Gangotri Temple is a key attraction of this trek\n\nSituated at an altitude of 3048 meter above the sea level, Gangotri acts as the base camp of the trek to Gaumukh Glacier.\n\nSince there is no village at this elevation ,finding a food stall or dhabas is not possible at Gaumukh and the only food you can have been the one that you carry with yourself on the trekking.\n\nThe overall trek distance is 46km.\n\nIt offers breath-taking views of the Gangotri peaks, Shivling , Thalay Sagar and Meru.");
        }
        if(value.equals("fromrnpcard")){
            imageView5.setImageResource(R.drawable.rnp);
            textView4.setText("Rajaji National Park");
            textView.setText("About");
            textView2.setText("Rajaji National Park is situated near Rishikesh and Haridwar in the state of Uttarakhand. Rajaji National Park, famous for tigers and elephants, has recently been given the status of Tiger Reserve by the Government of India.\n\nTourists enjoy jeep safari and elephant safari in Rajaji National Park. Spread over an area of about 34 km, this attractive park attracts the attention of tourists towards itself. Tourists also come to trek in its forest.\n\nTalking about the wildlife found in Rajaji National Park, here you can see Asian Elephants, Chital, Kakar, Python, Monitor Lizard, Panther, Bear, Tiger, Wild Cats, Sambar, Wild Boar and King Cobra etc. Many migratory birds can also be seen in Rajaji National Park.\n\nThe dense foliage of Sal trees and bamboo stalks found in Rajaji National Park can be seen. The forest range is famous for tropical and subtropical vegetation. Found on both sides of the river, deciduous broadleaf trees adorn the forestland. Beautiful flowering trees like Kachnar, Lantana, Sandon, Amaltas, Kedia, Acacia, and Cheela are seen in the park. Apart from this, the trees found here include ber, peepal, ficus, adina, shorea, bel, and chamar etc.\n\nThe timings for doing safari in Rajaji National Park are 6 am to 11 am, 11:30 am to 1 pm and 2:30 am to 5:30 pm. Although the time may change slightly according to the season.\n\nEntry – Free");
        }
        if(value.equals("fromfricard")){
            imageView5.setImageResource(R.drawable.fri);
            textView4.setText("FRI Museum");
            textView.setText("About");
            textView2.setText("Forest Research Institute (FRI) is a premier research institute located on Kaulagarh Road. The institute was established in 1906 and occupies a large area of about 450 hectares. The institute is famous for its splendid building, which represents a wonderful amalgamation of Greco-Roman and Colonial styles of architecture. There are six museums related to forestry in the premises of the building.\n\nThe museum exhibits a variety of non-timber forest products, timber, forestry, social forestry, pathology and entomology. Apart from the museums, the place also has a beautiful botanical garden. This park is very popular among the visitors. Apart from this, the Indira Gandhi National Forest Academy is also located here.");
        }
        if(value.equals("fromhkpcard")){
            imageView5.setImageResource(R.drawable.hkp);
            textView4.setText("Har ki Pauri");
            textView.setText("About");
            textView2.setText("Har ki pauri is a main attraction of Haridwar. Har ki pauri is dedicate to Goddess Ganga Maiya.Tourist touring Haridwar first visit Har ki Pauri and take bath in Maa Ganga.\n\nTaking a bath here is the most ardent desire of every devotee who comes to Haridwar because it is believed that bathing here leads to salvation.\n\nThis holy ghat was built by King Vikramaditya in the memory of his brother Bhartrihari. It is said that Bhartrihari had come to Haridwar to meditate on the banks of river Ganges and it was here that he took his last breath. After his death, King Vikramaditya built a ghat here which is today known as \"Har Ki Pauri\"\n\nHar Ki Pauri or Brahmakund is the main ghat of the holy city of Haridwar. It is believed that this is the place from where the river Ganges leaves the mountains and takes the direction of the plains. The river at this place has the power to wash away sins and here the footprints of Srihari in a stone support this point.\n\nEvery evening at sunset, the sage performs the Ganga Aarti, at which time the water flowing down the river is completely bathed in light and the priests engage in rituals. The Ganga Aarti is usually performed from 5:30 am to 6:30 am and from 6:00 pm to 7:00 pm in the evening. If you want to receive this aarti we advise you to reach at 4 pm to avoid the crowd.\n\nGanga Aarti\n\nMorning  -  5:30am to 6:30am\n\nEvening  -   6:00pm to 7:00pm\n\nHar ki pauri is just 2KM away from Haridwar Railway station.\n\nIn Har ki Pauri there is one  clock tower which is known as  Raja Birla Tower. here we see one bridge which known as a Lakshman jula.");
        }
        if(value.equals("frombycar")){
            imageView5.setImageResource(R.drawable.bycar);
            textView4.setText("By Car");
            textView.setText("Information");
            textView2.setText("Yamunotri is directly not connected with motorable roads and so trekking begins at Hanuman chatti which is 14 kms away from Yamunotri temple and Janki chatti which is 6 km trek to Yamunotri temple.\n\nHanuman chatti can be reached by ISBT buses from Haridwar, Rishikesh and Dehradun. Janki chatti can be reached by taking buses from Haridwar , Rishikesh, Dehradun, etc.  till Barkot and then taking taxi for Janki chatti which is 45 kms from Barkot.\n\nJanki chatti is the ultimate place for reaching Yamunotri by trekking.");
        }
        if(value.equals("frombytrain")){
            imageView5.setImageResource(R.drawable.bytrain);
            textView4.setText("By Rail");
            textView.setText("Information");
            textView2.setText("The nearest Railway stations to Yamunotri are Rishikesh, Dehradun and Haridwar. Rishikesh railway station is located at average 172 kms from Yamunotri, Rishikesh Railway station is situated at 200 kms from Yamunotri and Haridwar Railway station is located at a distance of 211 km from Yamunotri.\n\nThese Railway stations are very well connected with major cities of India  and trains to Rishikesh, Haridwar and Dehradun are frequent.\n\nFrom these stations, buses and taxis are available that will take tourist up-to Barkot  and Hanuman chatti  which are located at 51 kms and 14 kms away from Yamunotri temple respectively.");
        }
        if(value.equals("frombyair")){
            imageView5.setImageResource(R.drawable.byair);
            textView4.setText("By Air");
            textView.setText("Information");
            textView2.setText("Dehradun can be reached via Jolly Grant Airport and then tourist can take helicopter from Dehradun to Kharsali.\n\nThe helicopter services are available in Shastradhara helipad Dehradun and then arrive at Kharsali with Helicopter for trekking 6 km to Yamunotri\n\nThe helicopter services offered at Sahastradhara has Rs 3,75,000 for 6 persons including tax and will take 30 minutes approximately from Sahastradhara to reach Kharsali. Himalayan Heli’s ground staff will welcome the tourists and provide them with Palki or Pony for Yamunotri trek.");
        }
        if(value.equals("fromsuryakund")){
            imageView5.setImageResource(R.drawable.suryakund);
            textView4.setText("Suryakund");
            textView.setText("About");
            textView2.setText("It is a hot water spring that is situated near Yamunotri temple and it serves as the holy place as it is situated in the vicinity of Yamunotri temple\n\nPilgrims  come from all over the world to visit this holy kund.\n\nThey prepare prasad out of potatoes and rice in the hot spring water by tying it up with muslin cloth and then it is offered to the temple deity.");
        }
        if(value.equals("fromtaptkund")){
            imageView5.setImageResource(R.drawable.taptkund);
            textView4.setText("Taptkund");
            textView.setText("About");
            textView2.setText("It  is a lukewarm water spring and people bath in it before doing puja in the temple.\n\nIt is believed that all the  fatigue of devotees are vanished out once they bath in this holy kund.\n\nAccording to Hindu mythology, all types of Skin diseases are also vanished if devotees take a bath in this kund.\n\nIt is situated in the vicinity of Yamunotri temple.");
        }
        if(value.equals("fromdivyashila")){
            imageView5.setImageResource(R.drawable.divyashila);
            textView4.setText("Divyashila");
            textView.setText("About");
            textView2.setText("Also known as ‘Slab of Divine light’ is a pious stone or pillar located near Yamunotri and Surya kund.\n\nThe devotees visiting Yamunotri temple have to visit and worship Divya shila before entering the temple premises.\n\nWorshiping Divya shila is a part of puja ritual at Yamunotri and although it is not mandatory but it is advised to worship before entering the temple.\n\nDevotees first take bath into the Tapt kund.\n\nThen, they cook the potatoes and rice in the Surya kund which is offered as prasad first to Divya shila and then it is taken inside the temple.");
        }
        if(value.equals("fromtime_yam")){
            imageView5.setImageResource(R.drawable.time_yam);
            textView4.setText("When to Visit");
            textView.setText("Best Time");
            textView2.setText("The gates of the Yamunotri which is the first chardham of Uttarakhand opens of Akshay tritya ( May ) and closes on Yama Dwitiya ( second day after Diwali ).\n\nSo , during the winter the deity is brought to Kharsali – winter seat of Goddess.\n\nIt is our advice that one should visit the Yamunotri temple during the months of September and October as during the months from May to August there is usually a very high rush of  pilgrims.\n\nThe prices of Rest rooms, Hotels, Taxies, Ponies, Palanquins and Mules are also overpriced.\n\nWe recommend not to visit during monsoon as during this time there are lots of landslides and rainfall which will Ruin the trekking journey to Yamunotri.\n\nYamunotri temple opens at 6 AM and closes at 8 PM for the pilgrims. The morning aarti starts at 6:30 AM and the evening aarti starts at 7:30 PM");
        }
        if(value.equals("fromhanumanchatti")){
            imageView5.setImageResource(R.drawable.hc);
            textView4.setText("Hanuman Chatti");
            textView.setText("About");
            textView2.setText("It is situated 13 kms before Yamunotri Dham and it is a serene place offering plenty of accommodation facilities and it is a temple dedicated to Lord Hanuman.\n\nIt is a favourite place for trekking spot in the region.\n\nHanuman chatti used to be the starting place for trekking to Yamunotri but now jeepable roads are made up-to Janki chatti, then shortening the distance up-to 7 kms.\n\nApart from Yamunotri the best trip of Hanuman chatti is towards Darwa  top and Dodi tal.");
        }
        if(value.equals("fromkharsali")){
            imageView5.setImageResource(R.drawable.kharsali);
            textView4.setText("Kharsali");
            textView.setText("About");
            textView2.setText("The  untouched village of Kharsali known as “Khushimath” is cradled with love in Uttarkashi district of Uttarakhand.\n\nThe tiny hamlet of  Kharsali has historic  significance as it the winter seat of Goddess Yamuna\n\nSince the Yamunotri shrine becomes inaccessible in winters, the deity is brought here for worshipping.\n\nIt is located at distance of 8 km from Yamunotri temple and it has  two shani dev’s temple – one is the ancient 500 years old and the one that is built recently where the deity  is brought in the season of winter.");
        }
        if(value.equals("fromshanidevmandir")){
            imageView5.setImageResource(R.drawable.shanidevmandir);
            textView4.setText("Shani Dev Mandir");
            textView.setText("About");
            textView2.setText("The shani dev temple was built by the mighty Pandava brother of the epic Mahabharata.\n\nAs per Hindu mythology, Shani dev is the son of Surya and the brother of goddess Yamuna.\n\nAt every Akshay tritya during the first week of May every year, Lord Shani dev visits his sister Yamuna at Yamunotri and on the occasion of Yama Dwitiya he then returns to Kharsali so that he can take his sister to Kharsali.");
        }
        if(value.equals("fromjankichatti")){
            imageView5.setImageResource(R.drawable.jc);
            textView4.setText("Janki Chatti");
            textView.setText("About");
            textView2.setText("Janki chatti acts as major hub for pilgrims traveling to Yamunotri\n\nIt lies in closer proximity to Indo-Chinese border.\n\nFor trekking till Yamunotri temple, Ponies and Palanquins are available from Janki chatti.\n\nIt is surrounded by mountains on all sides and is known for its hot water springs.\n\nTourists can purchase Raincoat and other necessary items from Janki chatti.\n\nBudget and deluxe hotels are available at Janki chatti which have pretty good facilities.");
        }
    }
}