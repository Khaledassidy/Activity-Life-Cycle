package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class save_restore_instance extends AppCompatActivity {
    EditText enter_name;
    TextView print_name;
    Button print;
    String name=null;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_restore_instance);
        enter_name=findViewById(R.id.enter_name);
        print_name=findViewById(R.id.print_name);
        print=findViewById(R.id.print);



        print.setOnClickListener(v -> {

           name=enter_name.getText().toString();
            print_name.setText(""+name);
        });

    }

    //7a 2a3mel exmple 7et textview b nous sheshe w 7et edit text w bade kel she b7oto bel edit text bas ekbous 3al button yentaba3 yentaba3 bel text view
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //ana fa2dt l name bha l 7ale so b5azen bel bundel name 2awl she
        //bas houn 7a yseer 8alat lesh
        //ana 2awl she keen name=null bel portriat abl ma ef2es 3al button
        //rje3t bas fa2st 3al button sar name="khaled" bel portrait
        //rje3t bade 2a3ml landscape
        //fa abl ma 2a3ml landsacape sayvt variable name le keen name="khaled"
        //w reje3t 3mlt restore bas sert land scape fa keen b2alb l bundle value khaled
        //bas ana bas 2albt landscape berja3 benshe2 l activity mn 2awl mn sefr fa 7a ykoun variable name 7a yerja3 null bas ma b2sser ana msayev bel bunle khaled fa 3ade meshe l 7al
        //bas hala2 ana bade erja3 2e2loub la portrait bala ma okbous 3al button
        //so abl ma 2erja3 en2ol bade fout 3al funnction saveinstance w sayev name bas hala2 ya koun name=null so ma 7a ysayev null
        //w bas eje la 2a3mel restore 7a ykoun bel bundle null so 7a yetba3 null lesh l2no ana ma fe 8eer sha8le bt8yere variable name le howe bas 2okbous 3al button bas ana ma kabst
        //so l 7al bade ma sayev le b2alb l vaibale name la2
        //sayev le b2alb text view
        //sa3eta la nerja3 la ma7al ma kena landscape keen b2alb text view fe khaled so 7a yestayav bel bundel khaled so 7a yerja3 ydal khaled b2alb l text view wa2t na3mel restore
        //l2no ana 3mlt save la le b2alb text view
        //outState.putString("my_name",name); not correct

        //correct
        outState.putString("my_name",print_name.getText().toString());
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //houn ba3mel restore lal variable x le sayvto bel savedinstance
        String x=savedInstanceState.getString("my_name");
        print_name.setText(""+x);
    }
}



//tare2a tenye
//hala2 fe 7al tene la hay l meshkle eno ana emna3 l oriantationn ta3et shshe bas 7al mesh mnee7 sara7a
//la 2emna3 l orination ta3et shshe brou7 3al manificit file 3al activity save_restore_instance w bektoub attribute jdede
//android:screenOrientation="portrait" ya3ne hay l activity ma bteshte8l 8eer landscape


//fe tare2a telte: eno ne7na mna3ref alb sheshe(oriantation) ta8yer screensize,colormode,density,keybord,fontscale keloun haw configuration changes
//fa fene rou7 3ala l manifist b2alb l activity le badak yeha l heye save_restore_instance
//fe attribute esma android:configChanges"" w been haw l qutation l eshaya le bt7adeda metl oriantation,screensize...etc le bt7ota b2alb l quation ma bt5ale l activity terja3 ta3mel Create mn 2awl w jdeded
//ya3ne la n2ol 7atet android:configChanges""oriantation|screenSize" so 3am 2olo hay l configration change l oriantation bas tseer ma t5ale l activity terja3 ta3mel create mn 2awl w jdeed w bhay l 7ale 7aleet l meshklee

// bas be7ltee lezm android:configChanges"oriantation|screenSize" 2olo l oriantion w l screensize abl l version 12 keen lezm ektob haw l tnen ba3d l version 12 bekafe bas
// android:configChanges"oriantation"