package com.example.resumemaker;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RefrenceActivity2 extends AppCompatActivity {

    private ImageView minus3_btn,add_btn3,next6_btn;
    private TextView name_txt,jobtitle_txt,pnum_txt,mail_txt;
    private EditText name_edt,jobtitle_edt,pnum_edt,mail_edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrence2);

        binding();

        add_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_txt.setVisibility(name_txt.VISIBLE);
                jobtitle_txt.setVisibility(jobtitle_txt.VISIBLE);
                pnum_txt.setVisibility(pnum_txt.VISIBLE);
                mail_txt.setVisibility(mail_txt.VISIBLE);
                name_edt.setVisibility(name_edt.VISIBLE);
                jobtitle_edt.setVisibility(jobtitle_edt.VISIBLE);
                pnum_edt.setVisibility(pnum_edt.VISIBLE);
                mail_edt.setVisibility(mail_edt.VISIBLE);
                minus3_btn.setVisibility(minus3_btn.VISIBLE);
            }
        });

        minus3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_txt.setVisibility(name_txt.INVISIBLE);
                jobtitle_txt.setVisibility(jobtitle_txt.INVISIBLE);
                pnum_txt.setVisibility(pnum_txt.INVISIBLE);
                mail_txt.setVisibility(mail_txt.INVISIBLE);
                name_edt.setVisibility(name_edt.INVISIBLE);
                jobtitle_edt.setVisibility(jobtitle_edt.INVISIBLE);
                pnum_edt.setVisibility(pnum_edt.INVISIBLE);
                mail_edt.setVisibility(mail_edt.INVISIBLE);
                minus3_btn.setVisibility(minus3_btn.INVISIBLE);

            }
        });
        next6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RefrenceActivity2.this , chooseActivity2.class);
                startActivity(intent);
            }
        });


    }

    private void binding()
    {
        minus3_btn = findViewById(R.id.minus3_btn);
        next6_btn = findViewById(R.id.next6_btn);
        add_btn3 = findViewById(R.id.add_btn3);
        name_txt = findViewById(R.id.name_txt);
        jobtitle_txt = findViewById(R.id.jobtitle_txt);
        pnum_txt = findViewById(R.id.pnum_txt);
        mail_txt = findViewById(R.id.mail_txt);
        name_edt = findViewById(R.id.name_edt);
        jobtitle_edt = findViewById(R.id.jobtitle_edt);
        pnum_edt = findViewById(R.id.pnum_edt);
        mail_edt = findViewById(R.id.mail_edt);
    }
}