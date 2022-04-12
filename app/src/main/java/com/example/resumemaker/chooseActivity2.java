package com.example.resumemaker;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class chooseActivity2 extends AppCompatActivity {

    private Button preview_btn,change_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose2);

        binding();

        preview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chooseActivity2.this , previewActivity2.class);
                startActivity(intent);
            }
        });

        change_btn.setOnClickListener(new View.OnClickListener() {
            @java.lang.Override
            public void onClick(View view) {
                Intent intent = new Intent(chooseActivity2.this , templateActivity2.class);
                startActivity(intent);
            }
        });

    }

    private void binding() {
        preview_btn = findViewById(R.id.preview_btn);
        change_btn = findViewById(R.id.change_btn);
    }
}