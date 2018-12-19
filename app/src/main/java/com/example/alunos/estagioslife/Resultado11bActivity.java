package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado11bActivity extends AppCompatActivity {

    Button btnResultado11b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado11b);

        btnResultado11b = (Button) findViewById(R.id.btnResultado11b);
    }

    public void abrirTela12(View v) {

        Intent iTela12 = new Intent(this, Tela12Activity.class);

        startActivity(iTela12);
    }
}
