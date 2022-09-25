package com.example.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasiluser, hasilpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username = getIntent().getExtras().getString("username");
        String password = getIntent().getExtras().getString("password");

        hasiluser = findViewById(R.id.hasilusername);
        hasilpass = findViewById(R.id.hasilpassword);

        hasiluser.setText("Username Saya : "+username);
        hasilpass.setText("Password Saya : "+password);

    }
}