package com.example.resumemaker;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeclarationActivity2 extends AppCompatActivity {

    private TextView text1_txt,text2_txt,text3_txt,text4_txt,text5_txt;
    private Button choose_sum_btn;
    private EditText summary_edt;
    private ImageView next5_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declaration2);

        binding();

        text1_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = text1_txt.getText().toString();
                summary_edt.setText(temp1);
            }
        });

        text2_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp2 = text2_txt.getText().toString();
                summary_edt.setText(temp2);
            }
        });

        text3_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp3 = text3_txt.getText().toString();
                summary_edt.setText(temp3);
            }
        });

        text4_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp4 = text4_txt.getText().toString();
                summary_edt.setText(temp4);
            }
        });

        text5_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp5 = text5_txt.getText().toString();
                summary_edt.setText(temp5);
            }
        });


        choose_sum_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1_txt.setVisibility(text1_txt.VISIBLE);
                text2_txt.setVisibility(text2_txt.VISIBLE);
                text3_txt.setVisibility(text3_txt.VISIBLE);
                text4_txt.setVisibility(text4_txt.VISIBLE);
                text5_txt.setVisibility(text5_txt.VISIBLE);
            }
        });

        next5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String summary =  summary_edt.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
                editor.putString("summa",summary);
                editor.apply();

                Intent intent = new Intent(DeclarationActivity2.this , RefrenceActivity2.class);
                startActivity(intent);
            }
        });

    }

    private void binding()
    {
        choose_sum_btn = findViewById(R.id.choose_sum_btn);
        next5_btn = findViewById(R.id.next5_btn);
        summary_edt = findViewById(R.id.summary_edt);
        text1_txt = findViewById(R.id.text1_txt);
        text2_txt = findViewById(R.id.text2_txt);
        text3_txt = findViewById(R.id.text3_txt);
        text4_txt = findViewById(R.id.text4_txt);
        text5_txt = findViewById(R.id.text5_txt);
    }
}