package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

public class AssessmentActivity extends AppCompatActivity {

    AppBarLayout appBar;
    LinearLayout survey, backup, connectus, source;
    ImageView home, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);


        init();
        setOnClick();
    }

    private void setOnClick() {

        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, SurveyActivity.class);
                startActivity(intent);
            }
        });

        backup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, GuideActivity.class);
                startActivity(intent);
            }
        });

        connectus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, ConnectUsActivity.class);
                startActivity(intent);
            }
        });

        source.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, SourceActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssessmentActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

    }


    private void init() {

        appBar = findViewById(R.id.appBar);
        survey = findViewById(R.id.survey);
        backup = findViewById(R.id.backup);
        connectus = findViewById(R.id.connect_us);
        source = findViewById(R.id.source);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }
}