package com.example.animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Animation topAnimation,bottonAnimation,leftAnimation,rightAnimation;
    ImageButton imgbPerro,imgbLeon,imgbElefante,imgbTigre,imgbMono,imgbGato,imgbTucan,imgbAguila,imgbVaca,imgbHipopotamo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbPerro = findViewById(R.id.imgbPerro);
        imgbLeon = findViewById(R.id.imgbLeon);
        imgbElefante = findViewById(R.id.imgbElefante);
        imgbTigre = findViewById(R.id.imgbTigre);
        imgbMono = findViewById(R.id.imgbMono);
        imgbGato = findViewById(R.id.imgbGato);
        imgbTucan = findViewById(R.id.imgbTucan);
        imgbAguila = findViewById(R.id.imgbAguila);
        imgbVaca = findViewById(R.id.imgbVaca);
        imgbHipopotamo = findViewById(R.id.imgbHipopotamo);

        //Animacion
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnimation = AnimationUtils.loadAnimation(this,R.anim.botton_animation);
        leftAnimation = AnimationUtils.loadAnimation(this,R.anim.left_animation);
        rightAnimation = AnimationUtils.loadAnimation(this,R.anim.right_animation);

        //Animar
        imgbPerro.setAnimation(rightAnimation);
        imgbLeon.setAnimation(leftAnimation);
        imgbElefante.setAnimation(rightAnimation);
        imgbTigre.setAnimation(leftAnimation);
        imgbMono.setAnimation(rightAnimation);
        imgbGato.setAnimation(leftAnimation);
        imgbTucan.setAnimation(rightAnimation);
        imgbAguila.setAnimation(leftAnimation);
        imgbVaca.setAnimation(rightAnimation);
        imgbHipopotamo.setAnimation(leftAnimation);

        imgbPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","0");
                startActivity(intent);
            }
        });

        imgbLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","1");
                startActivity(intent);
            }
        });

        imgbElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","2");
                startActivity(intent);
            }
        });

        imgbTigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","3");
                startActivity(intent);
            }
        });

        imgbMono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","4");
                startActivity(intent);
            }
        });

        imgbGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","5");
                startActivity(intent);
            }
        });

        imgbTucan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","6");
                startActivity(intent);
            }
        });

        imgbAguila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","7");
                startActivity(intent);
            }
        });

        imgbVaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","8");
                startActivity(intent);
            }
        });

        imgbHipopotamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Presentacion.class);
                intent.putExtra("posicion","9");
                startActivity(intent);
            }
        });
    }
}