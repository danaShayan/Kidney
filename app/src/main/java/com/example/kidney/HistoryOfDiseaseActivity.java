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

public class HistoryOfDiseaseActivity extends AppCompatActivity {


    EditText duration, drowsiness, change, hands, ex_protein, urinary, urinary_color, urinary_volume, hospital_history, date;
    ImageView home, back;
    RelativeLayout appbar;

    AppCompatButton conform;

    DBHandler db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_of_disease);

        init();
        setOnClick();


    }


    private void init() {

        db = new DBHandler(this);

        appbar = findViewById(R.id.appBarLayout);
        duration = findViewById(R.id.durationOfDisease);
        drowsiness = findViewById(R.id.drowsiness);
        change = findViewById(R.id.changesCreatinine);
        ex_protein = findViewById(R.id.ex_protein);
        hands = findViewById(R.id.handsAndFoot);
        urinary = findViewById(R.id.urinary);
        urinary_color = findViewById(R.id.urinary_color);
        urinary_volume = findViewById(R.id.urinary_volume);
        hospital_history = findViewById(R.id.hospital_history);
        date = findViewById(R.id.dateOfRegister);

        conform = findViewById(R.id.conform);

        home = findViewById(R.id.home);
        back = findViewById(R.id.back);


    }

    private void setOnClick() {
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoryOfDiseaseActivity.this, ClinicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoryOfDiseaseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoryOfDiseaseActivity.this, ClinicActivity.class);
                startActivity(intent);
            }
        });

        conform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String durationTxt = duration.getText().toString();
                String drowsinessTxt = drowsiness.getText().toString();
                String changeTxt = change.getText().toString();
                String ex_proteinTxt = ex_protein.getText().toString();
                String handsTxt = hands.getText().toString();
                String urinaryTxt = urinary.getText().toString();
                String urinary_colorTxt = urinary_color.getText().toString();
                String urinary_volumeTxt = urinary_volume.getText().toString();
                String hospital_historyTxt = hospital_history.getText().toString();
                String dateTxt = date.getText().toString();

                if (durationTxt.isEmpty() || drowsinessTxt.isEmpty() || changeTxt.isEmpty() || ex_proteinTxt.isEmpty() ||

                        handsTxt.isEmpty() || urinaryTxt.isEmpty() || urinary_colorTxt.isEmpty() || urinary_volumeTxt.isEmpty() ||
                        hospital_historyTxt.isEmpty() || dateTxt.isEmpty()
                ) {
                    Toast.makeText(HistoryOfDiseaseActivity.this, "همه ی موارد را پر کنید", Toast.LENGTH_SHORT).show();
                } else {
                    db.addHistory(durationTxt, drowsinessTxt, changeTxt, handsTxt, ex_proteinTxt, urinaryTxt, urinary_volumeTxt, urinary_colorTxt, hospital_historyTxt , dateTxt);
                    Toast.makeText(HistoryOfDiseaseActivity.this, "با موفقیت اضافه شد", Toast.LENGTH_SHORT).show();

                }


            }
        });


    }


}