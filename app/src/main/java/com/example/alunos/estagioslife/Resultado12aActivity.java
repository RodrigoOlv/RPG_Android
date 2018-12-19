package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado12aActivity extends AppCompatActivity {

    Button btnResultado12a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado12a);

        btnResultado12a = (Button) findViewById(R.id.btnResultado12a);
    }

    public void abrirResultado4(View v) {

        Intent iResultado4 = new Intent(this, Resultado4Activity.class);

        startActivity(iResultado4);
    }
}
