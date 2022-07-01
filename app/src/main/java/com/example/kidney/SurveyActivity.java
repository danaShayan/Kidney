package com.example.kidney;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.appbar.AppBarLayout;

public class SurveyActivity extends AppCompatActivity {

    AppCompatButton link;
    String url = "https://survey.porsline.ir/s/x2yWSq7A";
    AppBarLayout appBar;
    ImageView home, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surveyy);

        init();
        setOnClick();

    }

    @SuppressLint("CutPasteId")
    private void init() {

        link = findViewById(R.id.gotolink);
        appBar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
    }

    private void setOnClick() {
        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SurveyActivity.this, AssessmentActivity.class);
                startActivity(intent);
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SurveyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SurveyActivity.this, AssessmentActivity.class);
                startActivity(intent);
            }
        });

    }


}