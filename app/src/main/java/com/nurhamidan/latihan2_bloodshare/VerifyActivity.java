package com.nurhamidan.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void openHomeActivity(View v) {
        Intent intent = new Intent(this, HomeActivity.class);
        this.startActivity(intent);
    }
}