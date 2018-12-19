package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela8Activity extends AppCompatActivity {

    Button btnTela8a, btnTela8b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);

        btnTela8a = (Button) findViewById(R.id.btnTela8a);
        btnTela8b = (Button) findViewById(R.id.btnTela8b);
    }

    public void abrirResultado8a(View v){
        Intent iResultado8a = new Intent(this, Resultado8aActivity.class);
        startActivity(iResultado8a);
    }

    public void abrirResultado8b(View v){
        Intent iResultado8b = new Intent(this, Resultado8bActivity.class);
        startActivity(iResultado8b);
    }
}
