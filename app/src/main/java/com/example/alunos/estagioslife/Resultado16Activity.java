package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado16Activity extends AppCompatActivity {

    Button btnResultado16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado16);

        btnResultado16 = (Button) findViewById(R.id.btnResultado16);
    }

    public void abrirTela17(View v) {

        Intent iTela17 = new Intent(this, Tela17Activity.class);

        startActivity(iTela17);
    }
}
