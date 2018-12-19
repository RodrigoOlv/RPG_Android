package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1Activity extends AppCompatActivity {

    Button btnTela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        btnTela1 = (Button) findViewById(R.id.btnTela1);
    }

    public void abrirResultado1(View v) {

        Intent iResultado1 = new Intent(this, Resultado1Activity.class);

        startActivity(iResultado1);
    }
}
