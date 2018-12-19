package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela14Activity extends AppCompatActivity {

    Button btnTela14a, btnTela14b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela14);

        btnTela14a = (Button) findViewById(R.id.btnTela14a);
        btnTela14b = (Button) findViewById(R.id.btnTela14b);
    }

    public void abrirResultado14a(View v) {

        Intent iResultado14a = new Intent(this, Resultado14aActivity.class);

        startActivity(iResultado14a);
    }

    public void abrirTela15(View v) {

        Intent iTela15 = new Intent(this, Tela15Activity.class);

        startActivity(iTela15);
    }
}
