package com.example.guardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button LoginButton, NewUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Button Work For Main Screen
        LoginButton = findViewById(R.id.LoginButton);
        NewUserButton = findViewById(R.id.NewUserButton);
    }



    public void onClick(View v) {
        switch (v.getId()) {
            // Login Button Click Event
            case R.id.LoginButton:
                LoginButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,  Login.class);
                        startActivity(intent);

                    } 
                });
                break;
            // New User Button Click Event
            case R.id.NewUserButton:
                NewUserButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(MainActivity.this, NewUser.class);
                        startActivity(intent2);

                    }
                });
                break;


        }
    }
}



