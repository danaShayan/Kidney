package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.kidney.DB.DBHandler;

public class SonographyActivity extends AppCompatActivity {


    EditText date, result, next, report;
    ImageView home, back;
    RelativeLayout appbar;
    AppCompatButton conform;
    DBHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonography);


        init();
        setOnClick();

    }

    private void init() {
        db = new DBHandler(this);
        date = findViewById(R.id.dateOfSonography);
        next = findViewById(R.id.nextReport);
        result = findViewById(R.id.resultOfTest);
        report = findViewById(R.id.report);
        conform = findViewById(R.id.conform);


        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
        appbar = findViewById(R.id.appBarLayout);
    }

    private void setOnClick() {

        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonographyActivity.this, ClinicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonographyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SonographyActivity.this, ClinicActivity.class);
                startActivity(intent);
            }
        });

        conform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dateTxt = date.getText().toString();
                String resultTxt = date.getText().toString();
                String nextTxt = next.getText().toString();
                String reportTxt = report.getText().toString();

                if (dateTxt.isEmpty() || nextTxt.isEmpty() || reportTxt.isEmpty()) {
                    Toast.makeText(SonographyActivity.this, "همه ی موارد را پر کنید", Toast.LENGTH_SHORT).show();
                } else {
                    db.addSonography(dateTxt, resultTxt, nextTxt, reportTxt);
                    Toast.makeText(SonographyActivity.this, "با موفقیت اضافه شد", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}