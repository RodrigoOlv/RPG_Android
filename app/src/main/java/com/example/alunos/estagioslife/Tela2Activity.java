package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2Activity extends AppCompatActivity {

    Button btnTela1, btnTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btnTela1 = (Button) findViewById(R.id.btnTela2a);
        btnTela2 = (Button) findViewById(R.id.btnTela2b);
    }

    public void abrirResultado1(View v) {

        Intent iResultado1 = new Intent(this, Resultado1Activity.class);

        startActivity(iResultado1);
    }

    public void abrirResultado2(View v) {

        Intent iResultado2 = new Intent(this, Resultado2Activity.class);

        startActivity(iResultado2);
    }
}
