package com.example.final_api_definitiva.services.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.final_api_definitiva.R;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //vinculacion con vista
        btn1 = findViewById(R.id.btn1);
        edit1 = findViewById(R.id.edit1);
        edit1.setText("");
        btn1.setOnClickListener(v -> {
            String text = edit1.getText().toString();
           Intent p= new Intent(MainActivity.this, MainActivity2.class);
           p.putExtra("text", text);
           startActivity(p);
        });
    }
}
