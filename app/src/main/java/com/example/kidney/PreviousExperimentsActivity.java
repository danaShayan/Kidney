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

public class PreviousExperimentsActivity extends AppCompatActivity {


    EditText date, result, next, report;
    ImageView home, back;
    RelativeLayout appbar;
    AppCompatButton conform;
    DBHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_experiments);

        init();
        setOnClick();

    }


    private void init() {

        db = new DBHandler(this);
        date = findViewById(R.id.dateOfTest);
        result = findViewById(R.id.resultOfTest);
        next = findViewById(R.id.nextReport);
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
                Intent intent = new Intent(PreviousExperimentsActivity.this, ClinicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviousExperimentsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviousExperimentsActivity.this, ClinicActivity.class);
                startActivity(intent);
            }
        });
        conform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dateTxt = date.getText().toString();
                String resultTxt = result.getText().toString();
                String nextTxt = next.getText().toString();
                String reportTxt = report.getText().toString();

                if (dateTxt.isEmpty() || nextTxt.isEmpty() || reportTxt.isEmpty() || resultTxt.isEmpty()) {
                    Toast.makeText(PreviousExperimentsActivity.this, "همه ی موارد را پر کنید", Toast.LENGTH_SHORT).show();
                } else {
                    db.addPrevious(dateTxt, resultTxt, nextTxt, reportTxt);
                    Toast.makeText(PreviousExperimentsActivity.this, "با موفقیت اضافه شد", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}