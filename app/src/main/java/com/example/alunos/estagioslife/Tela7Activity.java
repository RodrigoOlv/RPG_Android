package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela7Activity extends AppCompatActivity {

    Button btnTela7a, btnTela7b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);

        btnTela7a = (Button) findViewById(R.id.btnTela7a);
        btnTela7b = (Button) findViewById(R.id.btnTela7b);
    }

    public void abrirResultado7a(View v) {

        Intent iResultado7a = new Intent(this, Resultado7aActivity.class);

        startActivity(iResultado7a);
    }

    public void abrirResultado7b(View v) {

        Intent iResultado7b = new Intent(this, Resultado7bActivity.class);

        startActivity(iResultado7b);
    }
}
