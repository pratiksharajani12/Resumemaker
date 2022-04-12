package com.example.resumemaker;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class temp1designActivity2 extends AppCompatActivity {

    private TextView tname_txt,currentp_txt,gend_txt,email_txt,call_txt,gid_txt,tempskill_txt,tempskill2_txt,tempskill3_txt,
            gujtemp1_txt,engtemp1_txt,hinditemp1_txt,interesttemp1_txt,maritaltemp1_txt,univercitytemp1_txt,filedtemp1_txt,durationtemp1_txt,
            cname_txt,roletemp1_txt,yofex_txt,titletemp1_txt,timeptemp1_txt,pdestemp1_txt,tmemtemp1_txt,summarytemp1_txt,nationality1_txt
            ,objecttemp1_txt,syeartemp1_txt,eyeartemp1_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp1design2);

        binding();

        SharedPreferences prefs = getSharedPreferences("MY_PREFS_NAME",MODE_PRIVATE);
        String name1 = prefs.getString("fname","no data");
        String wcurrentp1 = prefs.getString("cprofile","no data");
        String objective1 = prefs.getString("objectiv","no data");
        String gender1 = prefs.getString("gende","no data");
        String mail1 = prefs.getString("rmail","no data");
        String phone1 = prefs.getString("call","no data");
        String github1 = prefs.getString("ghub","no data");
        String school1 = prefs.getString("univercity","no data");
        String pyear1 = prefs.getString("passinyear","no data");
        String field1 = prefs.getString("degree","no data");
        String c1 = prefs.getString("company","no data");
        String role1 = prefs.getString("crole","no data");
        String exyear1 = prefs.getString("experiencey","no data");
        String starty1 = prefs.getString("startyear","no data");
        String endy1 = prefs.getString("endyear","no data");
        String summary1 = prefs.getString("summa","no data");
        String title1 = prefs.getString("ptitle","no data");
        String description1 = prefs.getString("pdescrip","no data");
        String duration1 = prefs.getString("pduration","no data");
        String member1 = prefs.getString("tmem","no data");
        String skill11 = prefs.getString("skillone","no data");
        String skill21 = prefs.getString("skilltwo","no data");
        String skill31 = prefs.getString("skillthree","no data");
        String guj1 = prefs.getString("seekguj","no data");
        String eng1 = prefs.getString("seekeng","no data");
        String hindi1 = prefs.getString("seekhindi","no data");
        String interest1 = prefs.getString("finterest","no data");
        String national1 = prefs.getString("nationality","no data");
        String marit1 = prefs.getString("marrital","no data");


        tname_txt.setText(name1);
        currentp_txt.setText(wcurrentp1);
        objecttemp1_txt.setText(objective1);
        gend_txt.setText(gender1);
        email_txt.setText(mail1);
        call_txt.setText(phone1);
        gid_txt.setText(github1);
        tempskill_txt.setText(skill11);
        tempskill2_txt.setText(skill21);
        tempskill3_txt.setText(skill31);
        gujtemp1_txt.setText(guj1);
        engtemp1_txt.setText(eng1);
        hinditemp1_txt.setText(hindi1);
        interesttemp1_txt.setText(interest1);
        maritaltemp1_txt.setText(marit1);
        univercitytemp1_txt.setText(school1);
        filedtemp1_txt.setText(field1);
        durationtemp1_txt.setText(pyear1);
        cname_txt.setText(c1);
        roletemp1_txt.setText(role1);
        yofex_txt.setText(exyear1);
        titletemp1_txt.setText(title1);
        timeptemp1_txt.setText(duration1);
        pdestemp1_txt.setText(description1);
        tmemtemp1_txt.setText(member1);
        summarytemp1_txt.setText(summary1);
        nationality1_txt.setText(national1);
        syeartemp1_txt.setText(starty1);
        eyeartemp1_txt.setText(endy1);

    }
    private void binding()
    {
        tname_txt = findViewById(R.id.tname_txt);
        currentp_txt = findViewById(R.id.currentp_txt);
        gend_txt = findViewById(R.id.gend_txt);
        email_txt = findViewById(R.id.email_txt);
        call_txt = findViewById(R.id.call_txt);
        gid_txt = findViewById(R.id.gid_txt);
        tempskill_txt = findViewById(R.id.tempskill_txt);
        tempskill2_txt = findViewById(R.id.tempskill2_txt);
        tempskill3_txt = findViewById(R.id.tempskill3_txt);
        gujtemp1_txt = findViewById(R.id.gujtemp1_txt);
        engtemp1_txt = findViewById(R.id.engtemp1_txt);
        hinditemp1_txt = findViewById(R.id.hinditemp1_txt);
        interesttemp1_txt = findViewById(R.id.interesttemp1_txt);
        maritaltemp1_txt = findViewById(R.id.maritaltemp1_txt);
        univercitytemp1_txt = findViewById(R.id.univercitytemp1_txt);
        filedtemp1_txt = findViewById(R.id.filedtemp1_txt);
        durationtemp1_txt = findViewById(R.id.durationtemp1_txt);
        cname_txt = findViewById(R.id.cname_txt);
        roletemp1_txt = findViewById(R.id.roletemp1_txt);
        yofex_txt = findViewById(R.id.yofex_txt);
        titletemp1_txt = findViewById(R.id.titletemp1_txt);
        timeptemp1_txt = findViewById(R.id.timeptemp1_txt);
        pdestemp1_txt = findViewById(R.id.pdestemp1_txt);
        tmemtemp1_txt = findViewById(R.id.tmemtemp1_txt);
        summarytemp1_txt = findViewById(R.id.summarytemp1_txt);
        nationality1_txt = findViewById(R.id.nationality1_txt);
        objecttemp1_txt = findViewById(R.id.objecttemp1_txt);
        syeartemp1_txt = findViewById(R.id.syeartemp1_txt);
        eyeartemp1_txt = findViewById(R.id.eyeartemp1_txt);
    }
}