package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado6Activity extends AppCompatActivity {

    Button btnResultado6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado6);

        btnResultado6 = (Button) findViewById(R.id.btnResultado6);
    }

    public void abrirTela7(View v) {

        Intent iTela7 = new Intent(this, Tela7Activity.class);

        startActivity(iTela7);
    }
}
