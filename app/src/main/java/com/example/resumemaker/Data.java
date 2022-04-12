package com.example.resumemaker;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Data extends AppCompatActivity {

    private ImageView next_btn;
    private EditText rname_edt,currentp_edt,objective_edt,mailr_edt,phone_edt,github_edt,linkedin_edt,address_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        binding();

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = rname_edt.getText().toString();
                String wcurrentp = currentp_edt.getText().toString();
                String objective = objective_edt.getText().toString();
                String mail = mailr_edt.getText().toString();
                String phone = phone_edt.getText().toString();
                String github = github_edt.getText().toString();
                String linkedin = linkedin_edt.getText().toString();
                String address = address_edt.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
                editor.putString("fname",name);
                editor.putString("cprofile",wcurrentp);
                editor.putString("objectiv",objective);
                editor.putString("rmail",mail);
                editor.putString("call",phone);
                editor.putString("ghub",github);
                editor.putString("linked",linkedin);
                editor.putString("address1",address);
                editor.apply();


                Intent intent = new Intent(Data.this , EducationActivity2.class);
                startActivity(intent);


//                if (preview_btn == preview_btn)
//                {
//                    Intent intent1 = new Intent(DataActivity2.this , previewActivity2.class);
//
//                }
            }
        });
    }

    private void binding() {
        next_btn = findViewById(R.id.next_btn);
        rname_edt = findViewById(R.id.rname_edt);
        currentp_edt = findViewById(R.id.currentp_edt);
        objective_edt = findViewById(R.id.objective_edt);
        mailr_edt = findViewById(R.id.mailr_edt);
        phone_edt = findViewById(R.id.phone_edt);
        github_edt = findViewById(R.id.github_edt);
        linkedin_edt = findViewById(R.id.linkedin_edt);
        address_edt = findViewById(R.id.address_edt);
    }


}