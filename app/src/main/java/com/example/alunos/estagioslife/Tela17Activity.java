package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela17Activity extends AppCompatActivity {

    Button btnTela17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela17);

        btnTela17 = (Button) findViewById(R.id.btnTela17);
    }

    public void abrirResultado17(View v) {

        Intent iResultado17 = new Intent(this, Resultado17Activity.class);

        startActivity(iResultado17);
    }
}
