package com.nurhamidan.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
    NIM : 10118017
    Nama : Agung Nurhamidan
    Kelas : IF-1
    Tanggal Pengerjaan : 30 April 2021
    Deskripsi Pekerjaan : Membuat aplikasi untuk memenuhi latihan 2

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRegisterActivity(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        this.startActivity(intent);
    }
}