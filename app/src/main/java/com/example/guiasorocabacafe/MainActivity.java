package com.example.guiasorocabacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bnt1;
    Button bnt2;
    Button bnt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnt1 = findViewById(R.id.bnt1);
        bnt2 = findViewById(R.id.bnt2);
        bnt3 = findViewById(R.id.bnt3);

        bnt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent cafecomgato = new Intent(getApplicationContext(), zoologico.class);
                startActivity(cafecomgato);
            }
        });

        bnt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent padariareal = new Intent(getApplicationContext(), padariareal.class);
                startActivity(padariareal);
            }
        });

        bnt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent santacrema = new Intent(getApplicationContext(), chicomendes.class);
                startActivity(santacrema);
            }
        });


    }
}