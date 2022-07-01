package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Adapter.SonographyAdapter;
import com.example.kidney.DB.DBHandler;
import com.example.kidney.Model.Sonography;
import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

public class ShowSonographyActivity extends AppCompatActivity {


    DBHandler dbHandler;
    List<Sonography> list = new ArrayList<>();
    SonographyAdapter sonographyAdapter;
    RecyclerView sonographyRecyclerView;

    AppBarLayout appBar;
    ImageView home, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sonography);

        init();
        setListener();


        dbHandler = new DBHandler(this);

        sonographyRecyclerView.setHasFixedSize(true);
        sonographyRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        sonographyAdapter = new SonographyAdapter(this, list);
        sonographyRecyclerView.setAdapter(sonographyAdapter);
        dbHandler.readSonography(sonographyRecyclerView);

    }


    private void init() {
        sonographyRecyclerView = findViewById(R.id.sonographyRecyclerView);


        appBar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

    }

    private void setListener() {

        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowSonographyActivity.this, ClinicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowSonographyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowSonographyActivity.this, ClinicActivity.class);
                startActivity(intent);
            }
        });
    }
}