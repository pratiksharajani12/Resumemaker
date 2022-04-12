package com.example.resumemaker;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalActivity2 extends AppCompatActivity {


    private ImageView plus1_img,plus2_img,plus3_img,plus4_img,next4_btn;
    private EditText skill1_edt,skill2_edt,skill3_edt,skill4_edt,skill5_edt,nationality_edt,marital_edt;
    private SeekBar seek,seek1,seek2,seek3;
    private TextView seek_txt,seek1_txt,seek2_txt,seek3_txt;
    private String guj,eng,hindi,age,gender;
    private RadioGroup gender_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal2);


        binding();





        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seek_txt.setText(" " + i);
                age = "" + i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seek1_txt.setText(" " + i);
                guj = "" + i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seek2_txt.setText(" " + i);
                eng = "" + i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seek3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seek3_txt.setText(" " + i);
                hindi = "" + i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        plus1_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skill2_edt.setVisibility(skill2_edt.VISIBLE);
                plus2_img.setVisibility(plus2_img.VISIBLE);
            }
        });

        plus2_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skill3_edt.setVisibility(skill3_edt.VISIBLE);
                plus3_img.setVisibility(plus3_img.VISIBLE);
            }
        });

        plus3_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skill4_edt.setVisibility(skill4_edt.VISIBLE);
                plus4_img.setVisibility(plus4_img.VISIBLE);
            }
        });

        plus4_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skill5_edt.setVisibility(skill5_edt.VISIBLE);
            }
        });

        next4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill1 = skill1_edt.getText().toString();
                String skill2 = skill2_edt.getText().toString();
                String skill3 = skill3_edt.getText().toString();
                String national = nationality_edt.getText().toString();
                String marit = marital_edt.getText().toString();


                if (gender_edt.getCheckedRadioButtonId() == R.id.male_btn) {
                    gender = "Male";
                } else if (gender_edt.getCheckedRadioButtonId() == R.id.female_btn) {
                    gender = "female";
                }

                SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
                editor.putString("gende",gender);
                editor.putString("skillone",skill1);
                editor.putString("skilltwo",skill2);
                editor.putString("skillthree",skill3);
                editor.putString("seekguj",guj);
                editor.putString("seekeng",eng);
                editor.putString("seekhindi",hindi);
                editor.putString("nationality",national);
                editor.putString("marrital",marit);
                editor.apply();


                Intent intent = new Intent(PersonalActivity2.this , DeclarationActivity2.class);
                startActivity(intent);
            }
        });



    }

    private void binding()
    {
        plus1_img = findViewById(R.id.plus1_img);
        plus2_img = findViewById(R.id.plus2_img);
        plus3_img = findViewById(R.id.plus3_img);
        plus4_img = findViewById(R.id.plus4_img);
        skill1_edt = findViewById(R.id.skill1_edt);
        skill2_edt = findViewById(R.id.skill2_edt);
        skill3_edt = findViewById(R.id.skill3_edt);
        skill4_edt = findViewById(R.id.skill4_edt);
        skill5_edt = findViewById(R.id.skill5_edt);
        seek = findViewById(R.id.seek);
        seek1 = findViewById(R.id.seek1);
        seek2 = findViewById(R.id.seek2);
        seek3 = findViewById(R.id.seek3);
        seek_txt = findViewById(R.id.seek_txt);
        seek1_txt = findViewById(R.id.seek1_txt);
        seek2_txt = findViewById(R.id.seek2_txt);
        seek3_txt = findViewById(R.id.seek3_txt);
        next4_btn = findViewById(R.id.next4_btn);
        gender_edt = findViewById(R.id.gender_edt);
        nationality_edt = findViewById(R.id.nationality_edt);
        marital_edt = findViewById(R.id.marital_edt);
    }

}