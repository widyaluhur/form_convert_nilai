package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,nim,nilai;
    String get_nama, get_nim, nilai_value;
    Double get_nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.viewNama);
        nim = findViewById(R.id.viewNIM);
        nilai = findViewById(R.id.viewNilai);

        Bundle b = getIntent().getExtras();
        get_nama = b.getString("parse_nama");
        get_nim = b.getString("parse_nim");
        get_nilai = Double.parseDouble(b.getString("parse_nilai"));

        if (get_nilai <= 4 && get_nilai > 3.66){
            nilai_value = "A";
        }else if (get_nilai <= 3.66 && get_nilai > 3.33){
            nilai_value = "A-";
        }else if (get_nilai <= 3.33 && get_nilai > 3){
            nilai_value = "B+";
        }else if (get_nilai <= 3 && get_nilai > 2.66){
            nilai_value = "B";
        }else if (get_nilai <= 2.66 && get_nilai > 2.33){
            nilai_value = "B-";
        }else if (get_nilai <= 2.33 && get_nilai > 2){
            nilai_value = "C+";
        }else if (get_nilai <= 2 && get_nilai > 1.66){
            nilai_value = "C";
        }else if (get_nilai <= 1.66 && get_nilai > 1.33){
            nilai_value = "C-";
        }else if (get_nilai <= 1.33 && get_nilai > 1){
            nilai_value = "D+";
        }else if (get_nilai == 1){
            nilai_value = "D";
        }else{
            nilai_value = "Input Salah";
        }

        name.setText(get_nama);
        nim.setText(get_nim);
        nilai.setText(nilai_value);
    }
}