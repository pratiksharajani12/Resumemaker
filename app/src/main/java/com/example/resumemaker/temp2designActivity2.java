package com.example.resumemaker;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class temp2designActivity2 extends AppCompatActivity {

    private TextView name2_txt,call2_txt,objective2_txt,comapanyname2_txt,role2_txt,exyear2_txt,syear2_txt,eyear2_txt,univercity2_txt,
            field2_txt,passyear2_txt,title2_txt,description2_txt,member2_txt,duration2_txt,sumary2_txt,gujtemp2_txt,engtemp2_txt,hinditemp2_txt
            ,skilltemp2_txt,skill2temp2_txt,skill3temp2_txt,interesttemp2_txt,maritaltemp2_txt,emailtemp2_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2design2);

        binding();


        SharedPreferences prefs = getSharedPreferences("MY_PREFS_NAME",MODE_PRIVATE);
        String name2 = prefs.getString("fname","no data");
        String objective2 = prefs.getString("objectiv","no data");
        String mail2 = prefs.getString("rmail","no data");
        String phone2 = prefs.getString("call","no data");
        String school2 = prefs.getString("univercity","no data");
        String pyear2 = prefs.getString("passinyear","no data");
        String field2 = prefs.getString("degree","no data");
        String c2 = prefs.getString("company","no data");
        String role2 = prefs.getString("crole","no data");
        String exyear2 = prefs.getString("experiencey","no data");
        String starty2 = prefs.getString("startyear","no data");
        String endy2 = prefs.getString("endyear","no data");
        String summary2 = prefs.getString("summa","no data");
        String title2 = prefs.getString("ptitle","no data");
        String description2 = prefs.getString("pdescrip","no data");
        String duration2 = prefs.getString("pduration","no data");
        String member2 = prefs.getString("tmem","no data");
        String skill12 = prefs.getString("skillone","no data");
        String skill22 = prefs.getString("skilltwo","no data");
        String skill32 = prefs.getString("skillthree","no data");
        String guj2 = prefs.getString("seekguj","no data");
        String eng2 = prefs.getString("seekeng","no data");
        String hindi2 = prefs.getString("seekhindi","no data");
        String interest2 = prefs.getString("finterest","no data");
        String marit2 = prefs.getString("marrital","no data");


        name2_txt.setText(name2);
        call2_txt.setText(phone2);
        emailtemp2_txt.setText(mail2);
        objective2_txt.setText(objective2);
        comapanyname2_txt.setText(c2);
        role2_txt.setText(role2);
        exyear2_txt.setText(exyear2);
        syear2_txt.setText(starty2);
        eyear2_txt.setText(endy2);
        univercity2_txt.setText(school2);
        field2_txt.setText(field2);
        passyear2_txt.setText(pyear2);
        title2_txt.setText(title2);
        description2_txt.setText(description2);
        member2_txt.setText(member2);
        duration2_txt.setText(duration2);
        sumary2_txt.setText(summary2);
        gujtemp2_txt.setText(guj2);
        engtemp2_txt.setText(eng2);
        hinditemp2_txt.setText(hindi2);
        skilltemp2_txt.setText(skill12);
        skill2temp2_txt.setText(skill22);
        skill3temp2_txt.setText(skill32);
        interesttemp2_txt.setText(interest2);
        maritaltemp2_txt.setText(marit2);

    }
    private void binding(){
        name2_txt = findViewById(R.id.name2_txt);
        call2_txt = findViewById(R.id.call2_txt);
        emailtemp2_txt = findViewById(R.id.emailtemp2_txt);
        objective2_txt = findViewById(R.id.objective2_txt);
        comapanyname2_txt = findViewById(R.id.comapanyname2_txt);
        role2_txt = findViewById(R.id.role2_txt);
        exyear2_txt = findViewById(R.id.exyear2_txt);
        syear2_txt = findViewById(R.id.syear2_txt);
        eyear2_txt = findViewById(R.id.eyear2_txt);
        univercity2_txt = findViewById(R.id.univercity2_txt);
        field2_txt = findViewById(R.id.field2_txt);
        passyear2_txt = findViewById(R.id.passyear2_txt);
        title2_txt = findViewById(R.id.title2_txt);
        description2_txt = findViewById(R.id.description2_txt);
        member2_txt = findViewById(R.id.member2_txt);
        duration2_txt = findViewById(R.id.duration2_txt);
        sumary2_txt = findViewById(R.id.sumary2_txt);
        gujtemp2_txt = findViewById(R.id.gujtemp2_txt);
        engtemp2_txt = findViewById(R.id.engtemp2_txt);
        hinditemp2_txt = findViewById(R.id.hinditemp2_txt);
        skilltemp2_txt = findViewById(R.id.skilltemp2_txt);
        skill2temp2_txt = findViewById(R.id.skill2temp2_txt);
        skill3temp2_txt = findViewById(R.id.skill3temp2_txt);
        interesttemp2_txt = findViewById(R.id.interesttemp2_txt);
        maritaltemp2_txt = findViewById(R.id.maritaltemp2_txt);
    }

}