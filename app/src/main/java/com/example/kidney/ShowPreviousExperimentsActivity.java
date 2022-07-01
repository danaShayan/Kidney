package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Adapter.PreviousExperimentsAdapter;
import com.example.kidney.DB.DBHandler;
import com.example.kidney.Model.PreviousExperiments;
import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

public class ShowPreviousExperimentsActivity extends AppCompatActivity {


    RecyclerView prRecyclerView;
    DBHandler dbHandler;
    List<PreviousExperiments> list = new ArrayList<>();
    PreviousExperimentsAdapter previousExperimentsAdapter;


    AppBarLayout appBar;
    ImageView home, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_previous_experiments);
        init();
        setListener();


        dbHandler = new DBHandler(this);


        prRecyclerView.setHasFixedSize(true);
        prRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        previousExperimentsAdapter = new PreviousExperimentsAdapter(this, list);
        prRecyclerView.setAdapter(previousExperimentsAdapter);
        dbHandler.readPrevious(prRecyclerView);


    }

    private void init() {
        prRecyclerView = findViewById(R.id.show_previous_experimentsRecyclerView);

        appBar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

    }

    private void setListener() {

        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowPreviousExperimentsActivity.this, ClinicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowPreviousExperimentsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowPreviousExperimentsActivity.this, ClinicActivity.class);
                startActivity(intent);
            }
        });

    }


}