package com.example.resumemaker;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class temp3designActivity2 extends AppCompatActivity {

    private TextView name3_txt,currentp3_txt,address3_txt,phone3_txt,mail3_txt,github3_txt,linkedi3_txt,gujtemp2_txt,engtemp3_txt,hinditemp3_txt,interest3_txt
            ,marital3_txt,summarytemp3_txt,skill1temp3_txt,skill2temp3_txt,skill3temp3_txt,passtemp3_txt,univercity3_txt,field3_txt
            ,syeartemp3_txt,endyeartemp3_txt,cname3_txt,role3_txt,exp3_txt,title3_txt,description3_txt,member3_txt,nationality3_txt,pduration3_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp3design2);

        binding();

        SharedPreferences prefs = getSharedPreferences("MY_PREFS_NAME",MODE_PRIVATE);
        String name3 = prefs.getString("fname","no data");
        String wcurrentp3 = prefs.getString("cprofile","no data");
        String address3 = prefs.getString("address1","no data");
        String linkedin3 = prefs.getString("linked","no data");
        String github2 = prefs.getString("ghub","no data");
        String mail3 = prefs.getString("rmail","no data");
        String phone3 = prefs.getString("call","no data");
        String school3 = prefs.getString("univercity","no data");
        String pyear3 = prefs.getString("passinyear","no data");
        String field3 = prefs.getString("degree","no data");
        String c3 = prefs.getString("company","no data");
        String role3 = prefs.getString("crole","no data");
        String exyear3 = prefs.getString("experiencey","no data");
        String starty3 = prefs.getString("startyear","no data");
        String endy3 = prefs.getString("endyear","no data");
        String summary3 = prefs.getString("summa","no data");
        String title3 = prefs.getString("ptitle","no data");
        String description3 = prefs.getString("pdescrip","no data");
        String duration3 = prefs.getString("pduration","no data");
        String member3 = prefs.getString("tmem","no data");
        String skill13 = prefs.getString("skillone","no data");
        String skill23 = prefs.getString("skilltwo","no data");
        String skill33 = prefs.getString("skillthree","no data");
        String guj3 = prefs.getString("seekguj","no data");
        String eng3 = prefs.getString("seekeng","no data");
        String hindi3 = prefs.getString("seekhindi","no data");
        String interest3 = prefs.getString("finterest","no data");
        String marit3 = prefs.getString("marrital","no data");
        String national2 = prefs.getString("nationality","no data");

        name3_txt.setText(name3);
        currentp3_txt.setText(wcurrentp3);
        address3_txt.setText(address3);
        phone3_txt.setText(phone3);
        mail3_txt.setText(mail3);
        github3_txt.setText(github2);
        linkedi3_txt.setText(linkedin3);
        gujtemp2_txt.setText(guj3);
        engtemp3_txt.setText(eng3);
        hinditemp3_txt.setText(hindi3);
        interest3_txt.setText(interest3);
        marital3_txt.setText(marit3);
        summarytemp3_txt.setText(summary3);
        skill1temp3_txt.setText(skill13);
        skill2temp3_txt.setText(skill23);
        skill3temp3_txt.setText(skill33);
        passtemp3_txt.setText(pyear3);
        univercity3_txt.setText(school3);
        field3_txt.setText(field3);
        syeartemp3_txt.setText(starty3);
        endyeartemp3_txt.setText(endy3);
        cname3_txt.setText(c3);
        role3_txt.setText(role3);
        exp3_txt.setText(exyear3);
        title3_txt.setText(title3);
        description3_txt.setText(description3);
        member3_txt.setText(member3);
        nationality3_txt.setText(national2);
        pduration3_txt.setText(duration3);
    }

    private void binding(){
        name3_txt = findViewById(R.id.name3_txt);
        currentp3_txt = findViewById(R.id.currentp3_txt);
        address3_txt = findViewById(R.id.address3_txt);
        phone3_txt = findViewById(R.id.phone3_txt);
        mail3_txt = findViewById(R.id.mail3_txt);
        github3_txt = findViewById(R.id.github3_txt);
        linkedi3_txt = findViewById(R.id.linkedi3_txt);
        gujtemp2_txt = findViewById(R.id.gujtemp2_txt);
        engtemp3_txt = findViewById(R.id.engtemp3_txt);
        hinditemp3_txt = findViewById(R.id.hinditemp3_txt);
        interest3_txt = findViewById(R.id.interest3_txt);
        marital3_txt = findViewById(R.id.marital3_txt);
        summarytemp3_txt = findViewById(R.id.summarytemp3_txt);
        skill1temp3_txt = findViewById(R.id.skill1temp3_txt);
        skill2temp3_txt = findViewById(R.id.skill2temp3_txt);
        skill3temp3_txt = findViewById(R.id.skill3temp3_txt);
        passtemp3_txt = findViewById(R.id.passtemp3_txt);
        univercity3_txt = findViewById(R.id.univercity3_txt);
        field3_txt = findViewById(R.id.field3_txt);
        syeartemp3_txt = findViewById(R.id.syeartemp3_txt);
        endyeartemp3_txt = findViewById(R.id.endyeartemp3_txt);
        cname3_txt = findViewById(R.id.cname3_txt);
        role3_txt = findViewById(R.id.role3_txt);
        exp3_txt = findViewById(R.id.exp3_txt);
        title3_txt = findViewById(R.id.title3_txt);
        description3_txt = findViewById(R.id.description3_txt);
        member3_txt = findViewById(R.id.member3_txt);
        nationality3_txt = findViewById(R.id.nationality3_txt);
        pduration3_txt = findViewById(R.id.pduration3_txt);
    }
}