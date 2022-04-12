package com.example.resumemaker;



import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProjectdtlActivity2 extends AppCompatActivity {

    private ImageView add_btn2,minus2_btn,next3_btn;
    private TextView project_txt,projectdes_txt,projectTime_txt,teamMem_txt;
    private EditText project_edt,projectdes_edt,projectTime_edt,teamMem_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectdtl2);

        binding();

        add_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                project_txt.setVisibility(project_txt.VISIBLE);
                projectdes_txt.setVisibility(projectdes_txt.VISIBLE);
                projectTime_txt.setVisibility(projectTime_txt.VISIBLE);
                teamMem_txt.setVisibility(teamMem_txt.VISIBLE);
                project_edt.setVisibility(project_edt.VISIBLE);
                projectdes_edt.setVisibility(projectdes_edt.VISIBLE);
                projectTime_edt.setVisibility(projectTime_edt.VISIBLE);
                teamMem_edt.setVisibility(teamMem_edt.VISIBLE);
                minus2_btn.setVisibility(minus2_btn.VISIBLE);

            }
        });

        minus2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project_txt.setVisibility(project_txt.INVISIBLE);
                projectdes_txt.setVisibility(projectdes_txt.INVISIBLE);
                projectTime_txt.setVisibility(projectTime_txt.INVISIBLE);
                teamMem_txt.setVisibility(teamMem_txt.INVISIBLE);
                project_edt.setVisibility(project_edt.INVISIBLE);
                projectdes_edt.setVisibility(projectdes_edt.INVISIBLE);
                projectTime_edt.setVisibility(projectTime_edt.INVISIBLE);
                teamMem_edt.setVisibility(teamMem_edt.INVISIBLE);
                minus2_btn.setVisibility(minus2_btn.INVISIBLE);
            }
        });

        next3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String title = project_edt.getText().toString();
                String description = projectdes_edt.getText().toString();
                String duration = projectTime_edt.getText().toString();
                String member = teamMem_edt.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE).edit();
                editor.putString("ptitle",title);
                editor.putString("pdescrip",description);
                editor.putString("pduration",duration);
                editor.putString("tmem",member);
                editor.apply();

                Intent intent = new Intent(ProjectdtlActivity2.this , PersonalActivity2.class);
                startActivity(intent);
            }
        });

    }


    private void binding()
    {
        next3_btn = findViewById(R.id.next3_btn);
        minus2_btn = findViewById(R.id.minus2_btn);
        add_btn2 = findViewById(R.id.add_btn2);
        project_txt = findViewById(R.id.project_txt);
        projectdes_txt = findViewById(R.id.projectdes_txt);
        projectTime_txt = findViewById(R.id.projectTime_txt);
        teamMem_txt = findViewById(R.id.teamMem_txt);
        project_edt = findViewById(R.id.project_edt);
        projectdes_edt = findViewById(R.id.projectdes_edt);
        projectTime_edt = findViewById(R.id.projectTime_edt);
        teamMem_edt = findViewById(R.id.teamMem_edt);
    }
}