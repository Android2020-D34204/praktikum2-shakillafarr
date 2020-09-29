package com.example.kalk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText bilangan1, bilangan2, operasi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = findViewById(R.id.angka1);
        bilangan2 = findViewById(R.id.angka2);
        operasi = findViewById(R.id.operator);
        hasil = findViewById(R.id.hasilText);
        hitung = findViewById(R.id.tombol);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.parseInt(bilangan1.getText().toString());
                int a2 = Integer.parseInt(bilangan2.getText().toString());

                String hitungBilangan = operasi.getText().toString();

                if (hitungBilangan.equals("+")){
                    int result = a1 + a2;
                    hasil.setText(String.valueOf(result));

                }else if (hitungBilangan.equals("-")){
                    int result1 = a1 - a2;
                    hasil.setText(String.valueOf(result1));

                }else if (hitungBilangan.equals("/")){
                    int result2 = a1 / a2;
                    hasil.setText(String.valueOf(result2));

                }else if (hitungBilangan.equals("*")){
                    int result3 = a1 * a2;
                    hasil.setText(String.valueOf(result3));

                }else{
                    Toast.makeText(MainActivity.this, "Masukkan Operator yang tepat", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

