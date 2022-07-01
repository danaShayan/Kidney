package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ClinicActivity extends AppCompatActivity {


    RelativeLayout appbar;

    LinearLayout add_history, show_history, add_previous_experiments, show_previous_experiments, add_sonography, show_sonography;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic);

        init();
        setOnClick();

    }

    private void init() {

        appbar = findViewById(R.id.appBarLayout);
        add_history = findViewById(R.id.addHistory);
        show_history = findViewById(R.id.showHistory);
        add_previous_experiments = findViewById(R.id.add_previous_experiments);
        show_previous_experiments = findViewById(R.id.show_previous_experiments);
        add_sonography = findViewById(R.id.add_sonography);
        show_sonography = findViewById(R.id.show_sonography);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

    }

    private void setOnClick() {

        appbar.setOnClickListener(view -> {
            Intent intent = new Intent(ClinicActivity.this, LoginActivity.class);
            startActivity(intent);
        });


        add_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, HistoryOfDiseaseActivity.class);
                startActivity(intent);
            }
        });
        show_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, ShowHistoryActivity.class);
                startActivity(intent);
            }
        });

        add_previous_experiments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, PreviousExperimentsActivity.class);
                startActivity(intent);
            }
        });
        show_previous_experiments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, ShowPreviousExperimentsActivity.class);
                startActivity(intent);
            }
        });

        add_sonography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, SonographyActivity.class);
                startActivity(intent);
            }
        });
        show_sonography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, ShowSonographyActivity.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClinicActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }

}