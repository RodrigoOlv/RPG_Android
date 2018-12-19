package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela5Activity extends AppCompatActivity {

    Button btnTela5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        btnTela5 = (Button) findViewById(R.id.btnTela5);
    }

    public void abrirResultado5(View v) {

        Intent iResultado5 = new Intent(this, Resultado5Activity.class);

        startActivity(iResultado5);
    }
}
