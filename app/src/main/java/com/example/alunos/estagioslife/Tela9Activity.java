package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela9Activity extends AppCompatActivity {

    Button btnTela9a, btnTela9b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela9);

        btnTela9a = (Button) findViewById(R.id.btnTela9a);
        btnTela9b = (Button) findViewById(R.id.btnTela9b);
    }

    public void abrirResultado9(View v) {

        Intent iResultado9 = new Intent(this, Resultado9Activity.class);

        startActivity(iResultado9);
    }

    public void abrirTela5(View v) {

        Intent iTela5 = new Intent(this, Tela5Activity.class);

        startActivity(iTela5);
    }
}
