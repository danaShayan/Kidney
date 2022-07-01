package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LearnActivity extends AppCompatActivity {

    RelativeLayout appbar;

    LinearLayout health, ill, cure, care;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        init();
        setOnClick();

    }

    private void init() {
        appbar = findViewById(R.id.appBarLayout);
        health = findViewById(R.id.learn_kidney_health_layout);
        ill = findViewById(R.id.learn_kidney_ill_layout);
        cure = findViewById(R.id.learn_health_cure_layout);
        care = findViewById(R.id.learn_home_care_layout);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }

    private void setOnClick() {
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnActivity.this, KidneyHealthActivity.class);
                startActivity(intent);
            }
        });

        ill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnActivity.this, IllKidneyActivity.class);
                startActivity(intent);

            }
        });
        cure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LearnActivity.this, CureKidneyActivity.class);
                startActivity(intent);
            }
        });
        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LearnActivity.this, CareInHomeActivity.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }

}