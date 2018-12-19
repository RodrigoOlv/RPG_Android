package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado10bActivity extends AppCompatActivity {

    Button btnResultado10b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado10b);

        btnResultado10b = (Button) findViewById(R.id.btnResultado10b);
    }

    public void abrirTela11(View v) {

        Intent iTela11 = new Intent(this, Tela11Activity.class);

        startActivity(iTela11);
    }
}
