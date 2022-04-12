package com.example.resumemaker;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class templateActivity2 extends AppCompatActivity {

    private View temp1_img,temp2_img,temp3_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template2);

        binding();

        temp1_img.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View view) {
                Intent intent = new Intent(templateActivity2.this , temp1designActivity2.class);
                startActivity(intent);
            }
        });

        temp2_img.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View view) {
                Intent intent =new Intent(templateActivity2.this , temp2designActivity2.class);
                startActivity(intent);
            }
        });

        temp3_img.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View view) {
                Intent intent =new Intent(templateActivity2.this , temp3designActivity2.class);
                startActivity(intent);
            }
        });

    }

    private void binding() {
        temp1_img = findViewById(R.id.temp1_img);
        temp2_img = findViewById(R.id.temp2_img);
        temp3_img = findViewById(R.id.temp3_img);
    }
}