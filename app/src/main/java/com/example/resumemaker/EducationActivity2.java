package com.example.resumemaker;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EducationActivity2 extends AppCompatActivity {

    private ImageView add_btn,next1_btn,minus_btn;
    private TextView degree_txt,school_txt,passing_year_txt,interest_filed_txt;
    private EditText degree_edt,school_edt,passing_year_edt,interest_filed_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education2);

        binding();

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                view.setVisibility(View.INVISIBLE);//set visibility to false on create
//                view.setVisibility(View.GONE);

                degree_txt.setVisibility(degree_txt.VISIBLE);
                school_txt.setVisibility(school_txt.VISIBLE);
                passing_year_txt.setVisibility(passing_year_txt.VISIBLE);
                interest_filed_txt.setVisibility(interest_filed_txt.VISIBLE);
                degree_edt.setVisibility(degree_edt.VISIBLE);
                school_edt.setVisibility(school_edt.VISIBLE);
                passing_year_edt.setVisibility(passing_year_edt.VISIBLE);
                interest_filed_edt.setVisibility(interest_filed_edt.VISIBLE);
                minus_btn.setVisibility(minus_btn.VISIBLE);
            }
        });

        next1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String school = school_edt.getText().toString();
                String pyear = passing_year_edt.getText().toString();
                String field = degree_edt.getText().toString();
                String interest = interest_filed_edt.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
                editor.putString("univercity",school);
                editor.putString("passinyear",pyear);
                editor.putString("degree",field);
                editor.putString("finterest",interest);

                editor.apply();

                Intent intent = new Intent(EducationActivity2.this , JobexpActivity2.class);
                startActivity(intent);
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                degree_txt.setVisibility(degree_txt.INVISIBLE);
                school_txt.setVisibility(school_txt.INVISIBLE);
                passing_year_txt.setVisibility(passing_year_txt.INVISIBLE);
                interest_filed_txt.setVisibility(interest_filed_txt.INVISIBLE);
                degree_edt.setVisibility(degree_edt.INVISIBLE);
                school_edt.setVisibility(school_edt.INVISIBLE);
                passing_year_edt.setVisibility(passing_year_edt.INVISIBLE);
                interest_filed_edt.setVisibility(interest_filed_edt.INVISIBLE);
                minus_btn.setVisibility(minus_btn.INVISIBLE);
            }
        });

    }
    private void binding()
    {
        minus_btn = findViewById(R.id.minus_btn);
        next1_btn = findViewById(R.id.next1_btn);
        add_btn = findViewById(R.id.add_btn);
        degree_txt =findViewById(R.id.degree_txt);
        school_txt =findViewById(R.id.school_txt);
        passing_year_txt =findViewById(R.id.passing_year_txt);
        interest_filed_txt =findViewById(R.id.interest_filed_txt);
        degree_edt =findViewById(R.id.degree_edt);
        school_edt =findViewById(R.id.school_edt);
        passing_year_edt =findViewById(R.id.passing_year_edt);
        interest_filed_edt =findViewById(R.id.interest_filed_edt);
    }
}