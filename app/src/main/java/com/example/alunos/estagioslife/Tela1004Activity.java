package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1004Activity extends AppCompatActivity {

    Button btnTela1004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1004);

        btnTela1004 = (Button) findViewById(R.id.btnTela1004);
    }

    public void abrirResultado1004(View v) {

        Intent iResultado1004 = new Intent(this, Resultado1004Activity.class);

        startActivity(iResultado1004);
    }
}
