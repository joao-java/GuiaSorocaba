package com.example.guiasorocabacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class zoologico extends AppCompatActivity {

    Button bntvoltar;
    Button bntSite;
    Button bntMapa;
    Button bntLigar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoologico);

        bntvoltar = findViewById(R.id.bntvoltar);
        bntSite = findViewById(R.id.bntSite);
        bntLigar = findViewById(R.id.bntLigar);
        bntMapa = findViewById(R.id.bntMapa);


        bntSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafecomgato.com.br/onde-comer-em-sorocaba/")));
            }
        });

        bntLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = "011988888888";
                Uri uri = Uri.parse("tel:"+ numero);

                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });


        bntMapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent MapsActivity = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(MapsActivity);
            }
        });

        bntvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}