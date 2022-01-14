package com.example.elektronik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnoppo,btnTelevisi,btnLaptop;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnoppo = findViewById(R.id.btn_buka_oppo);
        btnTelevisi = findViewById(R.id.btn_buka_Televisi);
        btnLaptop = findViewById(R.id.btn_buka_Laptop);
        btnoppo.setOnClickListener(view -> bukaGaleri("Handphone"));
        btnLaptop.setOnClickListener(view -> bukaGaleri("Laptop"));
        btnTelevisi.setOnClickListener(view -> bukaGaleri("Televisi"));
    }

    private void bukaGaleri(String jenisElektronik) {
        Log.d("MAIN","Buka activity Coktail");
        Intent intent = new Intent(this, DaftarElektronikActifity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisElektronik);
        startActivity(intent);
    }
    public void Pindah(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}