package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String var_nama, var_nim, var_nilai;
    EditText nama, nim, nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void detail(View view){
        nama = findViewById(R.id.txNama);
        nim = findViewById(R.id.txNIM);
        nilai = findViewById(R.id.txNilai);

        Button submit = findViewById(R.id.btnSubmit);
        submit.setOnClickListener((v)->{
            var_nama = nama.getText().toString();
            var_nim = nim.getText().toString();
            var_nilai = nilai.getText().toString();
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            Bundle b = new Bundle();
            b.putString("parse_nama", var_nama);
            b.putString("parse_nim", var_nim);
            b.putString("parse_nilai", var_nilai);

            i.putExtras(b);
            startActivity(i);
        });
    }
}