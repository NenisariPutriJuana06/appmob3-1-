package com.example.ourapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);

    }
    public void clickRS(View View) {
        //gambar RS di klik
        Intent i = new Intent(  this, RS.class);
        startActivity(i);

        }
}