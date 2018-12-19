package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado2Activity extends AppCompatActivity {

    Button btnResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);

        btnResultado2 = (Button) findViewById(R.id.btnResultado2);
    }

    public void abrirTela3(View v) {

        Intent iTela3 = new Intent(this, Tela3Activity.class);

        startActivity(iTela3);
    }
}
