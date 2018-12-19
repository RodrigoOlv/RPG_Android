package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado13Activity extends AppCompatActivity {

    Button btnResultado13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado13);

        btnResultado13 = (Button) findViewById(R.id.btnResultado13);
    }

    public void abrirTela14(View v) {

        Intent iTela14 = new Intent(this, Tela14Activity.class);

        startActivity(iTela14);
    }
}
