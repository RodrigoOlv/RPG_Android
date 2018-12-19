package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela12Activity extends AppCompatActivity {

    Button btnTela12a, btnTela12b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela12);

        btnTela12a = (Button) findViewById(R.id.btnTela12a);
        btnTela12b = (Button) findViewById(R.id.btnTela12b);
    }

    public void abrirResultado12a(View v) {

        Intent iResultado12a = new Intent(this, Resultado12aActivity.class);

        startActivity(iResultado12a);
    }

    public void abrirTela13(View v) {

        Intent iTela13 = new Intent(this, Tela13Activity.class);

        startActivity(iTela13);
    }
}
