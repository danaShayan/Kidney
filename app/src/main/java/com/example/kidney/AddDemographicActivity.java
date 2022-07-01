package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.kidney.DB.DBHandler;

public class AddDemographicActivity extends AppCompatActivity {

    RelativeLayout appbar;

    EditText name, lastName, age, weight, height;
    RadioGroup genderG;
    RadioButton gender;

    ImageView home, back;

    AppCompatButton conform;

    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_activity_demographic);

        init();
        setOnclick();

    }

    private void init() {

        dbHandler = new DBHandler(this);
        appbar = findViewById(R.id.appBarLayout);
        name = findViewById(R.id.name);
        lastName = findViewById(R.id.last_name);
        age = findViewById(R.id.age);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);

        genderG = findViewById(R.id.genderG);


        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

        conform = findViewById(R.id.conform);

    }

    private void setOnclick() {

        appbar.setOnClickListener(view -> {
            Intent intent = new Intent(AddDemographicActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        home.setOnClickListener(view -> {
            Intent intent = new Intent(AddDemographicActivity.this, MainActivity.class);
            startActivity(intent);
        });
        back.setOnClickListener(view -> {
            Intent intent = new Intent(AddDemographicActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        conform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameTxt = name.getText().toString();
                String lastNameTxt = lastName.getText().toString();
                String ageTxt = age.getText().toString();
                String weightTxt = weight.getText().toString();
                String heightTxt = height.getText().toString();
                int selectedId = genderG.getCheckedRadioButtonId();
                gender = findViewById(selectedId);
                String genderTxt = gender.getText().toString();

                if (nameTxt.isEmpty() || lastNameTxt.isEmpty() || ageTxt.isEmpty() || weightTxt.isEmpty() || heightTxt.isEmpty()) {
                    Toast.makeText(AddDemographicActivity.this, "لظفا همه ی موارد را پر کنید", Toast.LENGTH_SHORT).show();
                } else {
                    dbHandler.addUser(nameTxt, lastNameTxt, ageTxt, weightTxt, heightTxt, genderTxt);
                    Toast.makeText(AddDemographicActivity.this, "با موفقثیت افزوده شد", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}