package com.example.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private Button buttonlogin;
    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonlogin=findViewById(R.id.btnLogin);

        user=findViewById(R.id.getusername);
        pass=findViewById(R.id.getpassword);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, MainActivity.class);
                pindah.putExtra("username",user.getText().toString());
                pindah.putExtra("password",pass.getText().toString());

                startActivity(pindah);
            }
        });
    }
}