package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela13Activity extends AppCompatActivity {

    Button btnTela13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela13);

        btnTela13 = (Button) findViewById(R.id.btnTela13);
    }

    public void abrirResultado13(View v) {

        Intent iResultado13 = new Intent(this, Resultado13Activity.class);

        startActivity(iResultado13);
    }
}
