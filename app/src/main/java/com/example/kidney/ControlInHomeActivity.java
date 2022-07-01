package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;

public class ControlInHomeActivity extends AppCompatActivity {


    AppBarLayout appbar;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_in_home);

        appbar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);


        appbar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ControlInHomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ControlInHomeActivity.this, CareInHomeActivity.class);
                startActivity(intent);
            }
        });
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ControlInHomeActivity.this, CareInHomeActivity.class);
                startActivity(intent);
            }
        });


    }
}