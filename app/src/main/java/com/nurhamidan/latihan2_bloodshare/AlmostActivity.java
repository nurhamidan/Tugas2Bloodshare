package com.nurhamidan.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void openVerifyActivity(View v) {
        Intent intent = new Intent(this, VerifyActivity.class);
        this.startActivity(intent);
    }
}