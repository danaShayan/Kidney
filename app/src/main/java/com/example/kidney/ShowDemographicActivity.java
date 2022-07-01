package com.example.kidney;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Adapter.UserAdapter;
import com.example.kidney.DB.DBHandler;
import com.example.kidney.Model.User;
import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

public class ShowDemographicActivity extends AppCompatActivity {


    AppBarLayout appBar;
    ImageView home, back;
    RecyclerView userRecyclerView;
    UserAdapter userAdapter;
    List<User> list = new ArrayList<>();
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_demographic);


        init();
        setListener();

        userRecyclerView.setHasFixedSize(true);
        userRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        userAdapter = new UserAdapter(this, list);
        userRecyclerView.setAdapter(userAdapter);
        dbHandler.readUser(userRecyclerView);

    }


    private void setListener() {

        appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowDemographicActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowDemographicActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowDemographicActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @SuppressLint("WrongViewCast")
    private void init() {

        dbHandler = new DBHandler(this);
        appBar = findViewById(R.id.appBar);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
        userRecyclerView = findViewById(R.id.userRecyclerView);

    }


}