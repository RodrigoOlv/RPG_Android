package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1001Activity extends AppCompatActivity {

    Button btnTela1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1001);

        btnTela1001 = (Button) findViewById(R.id.btnTela1001);
    }

    public void abrirResultado1001(View v) {

        Intent iResultado1001 = new Intent(this, Resultado1001Activity.class);
        startActivity(iResultado1001);
    }
}
