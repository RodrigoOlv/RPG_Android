package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela10Activity extends AppCompatActivity {

    Button btnTela10a, btnTela10b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela10);

        btnTela10a = (Button) findViewById(R.id.btnTela10a);
        btnTela10b = (Button) findViewById(R.id.btnTela10b);
    }

    public void abrirResultado10a(View v) {

        Intent iResultado10a = new Intent(this, Resultado10aActivity.class);

        startActivity(iResultado10a);
    }

    public void abrirResultado10b(View v) {

        Intent iResultado10b = new Intent(this, Resultado10bActivity.class);

        startActivity(iResultado10b);
    }
}
