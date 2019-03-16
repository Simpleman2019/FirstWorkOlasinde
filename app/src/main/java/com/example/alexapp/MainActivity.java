package com.example.alexapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void LOGIN (View View){
        Toast.makeText(this, "You are logged in, Please feel free to explore our world!", Toast.LENGTH_SHORT).show();
        }
     public void SIGNUP (View view) {
        Toast.makeText(this, "Profile Registered, Kindly login to your mail for confirmation.", Toast.LENGTH_LONG).show();
     }
    }
