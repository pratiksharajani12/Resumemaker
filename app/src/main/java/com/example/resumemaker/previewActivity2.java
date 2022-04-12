package com.example.resumemaker;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class previewActivity2 extends AppCompatActivity {

    private TextView rname_txt,rfiled_txt,objective_txt,gender_txt,rmail_txt,phone_txt,github_txt,edegree_txt,pyear_txt,filed_txt
            ,rcomapny_txt,prole_txt,exyear_txt,starty_txt,endy_txt,summary_txt,title_txt,pdescription_txt,duration_txt,tmem_txt,
            skill1_txt,skill2_txt,skill3_txt,guj_txt,eng_txt,hindi_txt,interest_txt,nationality_txt,marital_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview2);
        binding();

        SharedPreferences prefs = getSharedPreferences("MY_PREFS_NAME",MODE_PRIVATE);
        String name = prefs.getString("fname","no data");
        String wcurrentp = prefs.getString("cprofile","no data");
        String objective = prefs.getString("objectiv","no data");
        String gender = prefs.getString("gende","no data");
        String mail = prefs.getString("rmail","no data");
        String phone = prefs.getString("call","no data");
        String github = prefs.getString("ghub","no data");
        String school = prefs.getString("univercity","no data");
        String pyear = prefs.getString("passinyear","no data");
        String field = prefs.getString("degree","no data");
        String c = prefs.getString("company","no data");
        String role = prefs.getString("crole","no data");
        String exyear = prefs.getString("experiencey","no data");
        String starty = prefs.getString("startyear","no data");
        String endy = prefs.getString("endyear","no data");
        String summary = prefs.getString("summa","no data");
        String title = prefs.getString("ptitle","no data");
        String description = prefs.getString("pdescrip","no data");
        String duration = prefs.getString("pduration","no data");
        String member = prefs.getString("tmem","no data");
        String skill1 = prefs.getString("skillone","no data");
        String skill2 = prefs.getString("skilltwo","no data");
        String skill3 = prefs.getString("skillthree","no data");
        String guj = prefs.getString("seekguj","no data");
        String eng = prefs.getString("seekeng","no data");
        String hindi = prefs.getString("seekhindi","no data");
        String interest = prefs.getString("finterest","no data");
        String national = prefs.getString("nationality","no data");
        String marit = prefs.getString("marrital","no data");

//        String name = getIntent().getStringExtra("n1");

        rname_txt.setText(name);
        rfiled_txt.setText(wcurrentp);
        objective_txt.setText(objective);
        gender_txt.setText(gender);
        rmail_txt.setText(mail);
        phone_txt.setText(phone);
        github_txt.setText(github);
        edegree_txt.setText(school);
        pyear_txt.setText(pyear);
        filed_txt.setText(field);
        rcomapny_txt.setText(c);
        prole_txt.setText(role);
        exyear_txt.setText(exyear);
        starty_txt.setText(starty);
        endy_txt.setText(endy);
        summary_txt.setText(summary);
        title_txt.setText(title);
        pdescription_txt.setText(description);
        duration_txt.setText(duration);
        tmem_txt.setText(member);
        skill1_txt.setText(skill1);
        skill2_txt.setText(skill2);
        skill3_txt.setText(skill3);
        guj_txt.setText(guj);
        eng_txt.setText(eng);
        hindi_txt.setText(hindi);
        interest_txt.setText(interest);
        nationality_txt.setText(national);
        marital_txt.setText(marit);
    }
    private void binding() {
        rname_txt = findViewById(R.id.rname_txt);
        rfiled_txt = findViewById(R.id.rfiled_txt);
        objective_txt = findViewById(R.id.objective_txt);
        gender_txt = findViewById(R.id.gender_txt);
        rmail_txt = findViewById(R.id.rmail_txt);
        phone_txt = findViewById(R.id.phone_txt);
        github_txt = findViewById(R.id.github_txt);
        edegree_txt = findViewById(R.id.edegree_txt);
        pyear_txt = findViewById(R.id.pyear_txt);
        filed_txt = findViewById(R.id.filed_txt);
        rcomapny_txt = findViewById(R.id.rcomapny_txt);
        prole_txt = findViewById(R.id.prole_txt);
        exyear_txt = findViewById(R.id.exyear_txt);
        starty_txt = findViewById(R.id.starty_txt);
        endy_txt = findViewById(R.id.endy_txt);
        summary_txt = findViewById(R.id.summary_txt);
        title_txt = findViewById(R.id.title_txt);
        pdescription_txt = findViewById(R.id.pdescription_txt);
        duration_txt = findViewById(R.id.duration_txt);
        tmem_txt = findViewById(R.id.tmem_txt);
        skill1_txt = findViewById(R.id.skill1_txt);
        skill2_txt = findViewById(R.id.skill2_txt);
        skill3_txt = findViewById(R.id.skill3_txt);
        guj_txt = findViewById(R.id.guj_txt);
        eng_txt = findViewById(R.id.eng_txt);
        hindi_txt = findViewById(R.id.hindi_txt);
        interest_txt = findViewById(R.id.interest_txt);
        nationality_txt = findViewById(R.id.nationality_txt);
        marital_txt = findViewById(R.id.marital_txt);
    }
}