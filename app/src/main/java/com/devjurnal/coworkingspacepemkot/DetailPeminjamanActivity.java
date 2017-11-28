package com.devjurnal.coworkingspacepemkot;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DetailPeminjamanActivity extends AppCompatActivity {

    TextView nama, hp, kom, gedung, ruangan, agenda;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_peminjaman);

        nama = findViewById(R.id.tvNama); //a
        hp = findViewById(R.id.tvNoHp); //b
        kom = findViewById(R.id.tvKomunitas); //c
        gedung = findViewById(R.id.tvGedung); //d
        ruangan = findViewById(R.id.tvRuangan); //e
        agenda = findViewById(R.id.tvAgenda); //f

        Intent intent = getIntent();
        String c = intent.getStringExtra("komunitas");
        kom.setText(c);

        String f = intent.getStringExtra("agenda");
        agenda.setText(f);

        gedung.setText(intent.getStringExtra("tipe"));
        ruangan.setText(intent.getStringExtra("judul"));

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        nama.setText(sharedPreferences.getString("nama",""));
        hp.setText(sharedPreferences.getString("hp",""));



    }

    public void btnSendDetail(View view) {
        Toast.makeText(this, "PEMINJAMAN ANDA TERKIRIM", Toast.LENGTH_SHORT).show();
    }
}
