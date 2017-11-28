package com.devjurnal.coworkingspacepemkot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class KomentarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar);
    }

    public void btnKomentar(View view) {
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "KOMENTAR WAJIB DI ISI", Toast.LENGTH_SHORT).show();
    }
}
