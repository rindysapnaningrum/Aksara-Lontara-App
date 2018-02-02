package com.example.gcs.lontaraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HurufActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);


        ImageButton btndaftarhuruf = (ImageButton) findViewById(R.id.daftar_huruf);
        btndaftarhuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HurufActivity.this,DaftarHuruf.class));
            }
        });

        ImageButton btntandabaca = (ImageButton) findViewById(R.id.tanda_baca);
        btntandabaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HurufActivity.this,TandaBaca.class));
            }
        });

        ImageButton btnkata = (ImageButton) findViewById(R.id.kata);
        btnkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HurufActivity.this,KataActivity.class));
            }
        });


    }
}
