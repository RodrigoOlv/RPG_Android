package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3Activity extends AppCompatActivity {

    Button btnTela3a, btnTela3b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        btnTela3a = (Button) findViewById(R.id.btnTela3a);
        btnTela3b = (Button) findViewById(R.id.btnTela3b);
    }

    public void abrirResultado1(View v) {

        Intent iResultado1 = new Intent(this, Resultado1Activity.class);

        startActivity(iResultado1);
    }

    public void abrirResultado3(View v) {

        Intent iResultado3 = new Intent(this, Resultado3Activity.class);

        startActivity(iResultado3);
    }
}
