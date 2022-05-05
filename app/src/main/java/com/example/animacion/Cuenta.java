package com.example.animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
    }

    public void unete(View view) {
        Intent intent = new Intent(Cuenta.this, MainActivity.class);
        startActivity(intent);
    }
}