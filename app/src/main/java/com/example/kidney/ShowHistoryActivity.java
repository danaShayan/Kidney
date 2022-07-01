package com.example.kidney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Adapter.HistoryAdapter;
import com.example.kidney.DB.DBHandler;
import com.example.kidney.Model.History;
import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

public class ShowHistoryActivity extends AppCompatActivity {


    DBHandler dbHandler;
    List<History> list = new ArrayList<>();
    RecyclerView history;
    HistoryAdapter historyAdapter;

    AppBarLayout appBar;
    ImageView home, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_history);


        init();
        setListener();

        dbHandler = new DBHandler(this);
        history.setHasFixedSize(true);
        history.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        historyAdapter = new HistoryAdapter(this, list);
        history.setAdapter(historyAdapter);
        dbHandler.readHistory(history);


    }

    private void init() {
        history = findViewById(R.id.showHistoryRecyclerView);
        appBar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

    }

    private void setListener() {

        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowHistoryActivity.this, ClinicActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowHistoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowHistoryActivity.this, ClinicActivity.class);
                startActivity(intent);
            }
        });

    }

}