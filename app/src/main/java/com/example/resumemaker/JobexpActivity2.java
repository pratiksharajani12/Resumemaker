package com.example.resumemaker;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JobexpActivity2 extends AppCompatActivity {


    private ImageView add_btn1,next2_btn,minus1_btn;
    private TextView company_txt,role_txt,syear_txt,eyear_txt,experience_txt;
    private EditText company_edt,role_edt,smonth_edt,syear_edt,emonth_edt,eyear_edt,experience_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobexp2);

        binding();

        add_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                company_txt.setVisibility(company_txt.VISIBLE);
                role_txt.setVisibility(role_txt.VISIBLE);
                syear_txt.setVisibility(syear_txt.VISIBLE);
                eyear_txt.setVisibility(eyear_txt.VISIBLE);
                experience_txt.setVisibility(experience_txt.VISIBLE);
                company_edt.setVisibility(company_edt.VISIBLE);
                role_edt.setVisibility(role_edt.VISIBLE);
                syear_edt.setVisibility(syear_edt.VISIBLE);
                eyear_edt.setVisibility(eyear_edt.VISIBLE);
                experience_edt.setVisibility(experience_edt.VISIBLE);
                minus1_btn.setVisibility(minus1_btn.VISIBLE);
            }
        });

        next2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = company_edt.getText().toString();
                String role = role_edt.getText().toString();
                String exyear = experience_edt.getText().toString();
                String starty = syear_edt.getText().toString();
                String endy = eyear_edt.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
                editor.putString("company",c);
                editor.putString("crole",role);
                editor.putString("experiencey",exyear);
                editor.putString("startyear",starty);
                editor.putString("endyear",endy);
                editor.apply();


                Intent intent = new Intent(JobexpActivity2.this , ProjectdtlActivity2.class);
                startActivity(intent);
            }
        });

        minus1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                company_txt.setVisibility(company_txt.INVISIBLE);
                role_txt.setVisibility(role_txt.INVISIBLE);
                syear_txt.setVisibility(syear_txt.INVISIBLE);
                eyear_txt.setVisibility(eyear_txt.INVISIBLE);
                experience_txt.setVisibility(experience_txt.INVISIBLE);
                company_edt.setVisibility(company_edt.INVISIBLE);
                role_edt.setVisibility(role_edt.INVISIBLE);
                syear_edt.setVisibility(syear_edt.INVISIBLE);
                eyear_edt.setVisibility(eyear_edt.INVISIBLE);
                experience_edt.setVisibility(experience_edt.INVISIBLE);
                minus1_btn.setVisibility(minus1_btn.INVISIBLE);
            }
        });

    }

    private void binding()
    {
        minus1_btn = findViewById(R.id.minus1_btn);
        add_btn1 = findViewById(R.id.add_btn1);
        next2_btn = findViewById(R.id.next2_btn);
        company_txt =findViewById(R.id.company_txt);
        role_txt =findViewById(R.id.role_txt);
        syear_txt =findViewById(R.id.syear_txt);
        eyear_txt =findViewById(R.id.eyear_txt);
        experience_txt =findViewById(R.id.experience_txt);
        company_edt =findViewById(R.id.company_edt);
        role_edt =findViewById(R.id.role_edt);
        syear_edt =findViewById(R.id.syear_edt);
        eyear_edt =findViewById(R.id.eyear_edt);
        experience_edt =findViewById(R.id.experience_edt);

    }
}