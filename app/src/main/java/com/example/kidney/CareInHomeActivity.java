package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

public class CareInHomeActivity extends AppCompatActivity {


    LinearLayout medication, nutrition, proper_exercise, control;
    AppBarLayout appbar;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_in_home);

        init();
        setOnClick();

    }


    private void init() {

        appbar = findViewById(R.id.appBar);
        medication = findViewById(R.id.care_home_medication_layout);
        nutrition = findViewById(R.id.care_home_nutrition_layout);
        proper_exercise = findViewById(R.id.care_home_proper_exercise_layout);
        control = findViewById(R.id.care_home_control_layout);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }

    private void setOnClick() {

        medication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, MedicationCareInHomeActivity.class);
                startActivity(intent);
            }
        });

        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, NutritionCareInHomeActivity.class);
                startActivity(intent);
            }
        });

        proper_exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, ProperExerciseActivity.class);
                startActivity(intent);
            }
        });

        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, ControlInHomeActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });

        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareInHomeActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });

    }
}