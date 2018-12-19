package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1005bActivity extends AppCompatActivity {

    Button btnResultado1005b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1005b);

        btnResultado1005b = (Button) findViewById(R.id.btnResultado1005b);
    }

    public void abrirTela1006(View v) {

        Intent iTela1006 = new Intent(this, Tela1006Activity.class);

        startActivity(iTela1006);
    }
}
