package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado4Activity extends AppCompatActivity {

    Button btnResultado4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado4);

        btnResultado4 = (Button) findViewById(R.id.btnResultado4);
    }

    public void abrirTela5(View v) {

        Intent iTela5 = new Intent(this, Tela5Activity.class);

        startActivity(iTela5);
    }
}
