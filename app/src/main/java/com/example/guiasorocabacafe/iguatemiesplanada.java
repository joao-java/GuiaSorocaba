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
    Button bntSite2;
    Button bntMapa2;
    Button bntLigar2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicomendes);

        bntvoltar = findViewById(R.id.bntvoltar);
        bntSite2 = findViewById(R.id.bntSite2);
        bntLigar2 = findViewById(R.id.bntLigar2);
        bntMapa2 = findViewById(R.id.bntMapa2);


        bntSite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.padariareal.com.br/")));
            }
        });


        bntMapa2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent MapsActivity = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(MapsActivity);
            }
        });

        bntLigar2.setOnClickListener(new View.OnClickListener() {
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