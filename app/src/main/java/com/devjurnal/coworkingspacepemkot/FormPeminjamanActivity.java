package com.devjurnal.coworkingspacepemkot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormPeminjamanActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPinjam;
    EditText komunitas,mulai,akhir,agenda;
    String tipe, judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_peminjaman);

        Intent intent = getIntent();
        tipe = intent.getStringExtra("tipe");
        judul = intent.getStringExtra("judul");

        btnPinjam = findViewById(R.id.btnPinjam);
        btnPinjam.setOnClickListener(this);

        komunitas = findViewById(R.id.edtKomunitas);
        mulai = findViewById(R.id.edtWaktuMulai);
        akhir = findViewById(R.id.edtWaktuAkhir);
        agenda = findViewById(R.id.edtAgendaAcara);


    }

    @Override
    public void onClick(View view) {

        String community = komunitas.getText().toString();
        String start = mulai.getText().toString();
        String last = akhir.getText().toString();
        String schedule = agenda.getText().toString();

        if (community.isEmpty() || start.isEmpty() || last.isEmpty() || schedule.isEmpty()) {
            Toast.makeText(this, "ISI FORM TERLEBIH DAHULU", Toast.LENGTH_SHORT).show();
        } else {
            switch (view.getId())
            {
                case R.id.btnPinjam:
                    Intent intent = new Intent(FormPeminjamanActivity.this, DetailPeminjamanActivity.class);
                    intent.putExtra("komunitas",community);
                    intent.putExtra("mulai",start);
                    intent.putExtra("akhir",last);
                    intent.putExtra("agenda",schedule);
                    intent.putExtra("tipe",tipe);
                    intent.putExtra("judul",judul);
                    startActivity(intent);
                    break;
            }
        }


    }
}
