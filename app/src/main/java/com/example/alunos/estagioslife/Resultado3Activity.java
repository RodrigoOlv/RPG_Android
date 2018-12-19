package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado3Activity extends AppCompatActivity {

    Button btnResultado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado3);

        btnResultado3 = (Button) findViewById(R.id.btnResultado3);
    }

    public void abrirTela4(View v) {

        Intent iTela4 = new Intent(this, Tela4Activity.class);

        startActivity(iTela4);
    }
}
