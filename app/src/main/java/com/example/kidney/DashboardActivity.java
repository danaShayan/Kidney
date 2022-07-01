package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    LinearLayout login, assessment, guide, source;
    ImageView home, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();

        setOnClick();
    }

    private void setOnClick() {

        login.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        assessment.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, AssessmentActivity.class);
            startActivity(intent);
        });

        guide.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, GuideActivity.class);
            startActivity(intent);
        });

        source.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, SourceActivity.class);
            startActivity(intent);
        });

        home.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        back.setOnClickListener(view -> {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }

    private void init() {
        login = findViewById(R.id.login);
        assessment = findViewById(R.id.assessment);
        guide = findViewById(R.id.guide);
        source = findViewById(R.id.source);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }

}