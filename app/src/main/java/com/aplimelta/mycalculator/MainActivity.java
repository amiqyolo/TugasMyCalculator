package com.aplimelta.mycalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etValue1, etValue2;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnHitung.setOnClickListener(view -> showToast());
    }

    private void showToast() {
        Toast.makeText(this, "Sedang Dihitung", Toast.LENGTH_SHORT).show();
    }

    private void initView() {
        etValue1 = findViewById(R.id.et_value1);
        etValue2 = findViewById(R.id.et_value2);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung = findViewById(R.id.btn_hitung);
    }
}