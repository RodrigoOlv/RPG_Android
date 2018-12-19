package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela6Activity extends AppCompatActivity {

    Button btnTela6a, btnTela6b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        btnTela6a = (Button) findViewById(R.id.btnTela6a);
        btnTela6b = (Button) findViewById(R.id.btnTela6b);
    }

    public void abrirTela5(View v) {

        Intent iTela5 = new Intent(this,Tela5Activity.class);

        startActivity(iTela5);
    }

    public void abrirResultado6(View v) {

        Intent iResultado6 = new Intent(this,Resultado6Activity.class);

        startActivity(iResultado6);
    }
}
