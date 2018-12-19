package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4Activity extends AppCompatActivity {

    Button btnTela4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        btnTela4 = (Button) findViewById(R.id.btnTela4);
    }

    public void abrirResultado4(View v) {

        Intent iResultado4 = new Intent(this, Resultado4Activity.class);

        startActivity(iResultado4);
    }
}
