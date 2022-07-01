package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

public class IllKidneyActivity extends AppCompatActivity {

    AppBarLayout appbar;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ill_kidney);


        appbar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IllKidneyActivity.this, LearnActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IllKidneyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IllKidneyActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });


    }
}