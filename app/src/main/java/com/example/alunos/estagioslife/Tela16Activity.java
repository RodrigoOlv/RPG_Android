package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela16Activity extends AppCompatActivity {

    Button btnTela16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela16);

        btnTela16 = (Button) findViewById(R.id.btnTela16);
    }

    public void abrirResultado16(View v) {

        Intent iResultado16 = new Intent(this, Resultado16Activity.class);

        startActivity(iResultado16);
    }
}
