package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

public class GuideActivity extends AppCompatActivity {


    AppBarLayout appBar;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);


        init();
        setOnClick();


    }


    private void init() {
        appBar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }

    private void setOnClick() {
        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuideActivity.this, AssessmentActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuideActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuideActivity.this, AssessmentActivity.class);
                startActivity(intent);
            }
        });

    }

}