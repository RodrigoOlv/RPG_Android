package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela11Activity extends AppCompatActivity {

    Button btnTela11a, btnTela11b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela11);

        btnTela11a = (Button) findViewById(R.id.btnTela11a);
        btnTela11b = (Button) findViewById(R.id.btnTela11b);
    }

    public void abrirResultado11a(View v) {

        Intent iResultado11a = new Intent(this, Resultado11aActivity.class);

        startActivity(iResultado11a);
    }

    public void abrirResultado11b(View v) {

        Intent iResultado11b = new Intent(this, Resultado11bActivity.class);

        startActivity(iResultado11b);
    }
}
