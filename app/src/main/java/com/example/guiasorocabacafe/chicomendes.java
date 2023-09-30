package com.example.guiasorocabacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chicomendes extends AppCompatActivity {

    Button bntvoltar;
    Button bntSite3;
    Button bntMapa3;
    Button bntLigar3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemiesplanada);

        bntvoltar = findViewById(R.id.bntvoltar);
        bntSite3 = findViewById(R.id.bntSite3);
        bntLigar3 = findViewById(R.id.bntLigar3);
        bntMapa3 = findViewById(R.id.bntMapa3);


        bntSite3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/santacremacafe/")));
            }
        });

        bntMapa3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent MapsActivity = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(MapsActivity);
            }
        });

        bntLigar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = "011988888888";
                Uri uri = Uri.parse("tel:"+ numero);

                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
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