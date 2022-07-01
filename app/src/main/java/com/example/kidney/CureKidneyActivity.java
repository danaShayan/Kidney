package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

public class CureKidneyActivity extends AppCompatActivity {


    LinearLayout diagnostic, medical, health, pharmaceutical;
    AppBarLayout appbar;
    ImageView home, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cure_kidney);

        init();
        setOnClick();

    }


    private void init() {

        appbar = findViewById(R.id.appBar);
        diagnostic = findViewById(R.id.cure_kidney_diagnostic_layout);
        medical = findViewById(R.id.cure_kidney_medical_layout);
        health = findViewById(R.id.cure_kidney_health_layout);
        pharmaceutical = findViewById(R.id.pharmaceutical_kidney_layout);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }


    private void setOnClick() {

        diagnostic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CureKidneyActivity.this, DiagnosticServicesActivity.class);
                startActivity(intent);


            }
        });
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(CureKidneyActivity.this, MedicalServicesActivity.class);
                startActivity(intent);


            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CureKidneyActivity.this, HealthServicesActivity.class);
                startActivity(intent);

            }
        });
        pharmaceutical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CureKidneyActivity.this, PharmaceuticalActivity.class);
                startActivity(intent);


            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CureKidneyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CureKidneyActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CureKidneyActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });

    }


}


