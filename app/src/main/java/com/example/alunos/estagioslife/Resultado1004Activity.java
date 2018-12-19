package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1004Activity extends AppCompatActivity {

    Button btnResultado1004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1004);

        btnResultado1004 = (Button) findViewById(R.id.btnResultado1004);
    }

    public void abrirTela1005(View v) {

        Intent iTela1005 = new Intent(this, Tela1005Activity.class);

        startActivity(iTela1005);
    }
}
