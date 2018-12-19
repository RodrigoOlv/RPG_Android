package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado5Activity extends AppCompatActivity {

    Button btnResultado5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado5);

        btnResultado5 = (Button) findViewById(R.id.btnResultado5);
    }

    public void abrirTela6(View v) {

        Intent iTela6 = new Intent(this, Tela6Activity.class);

        startActivity(iTela6);
    }
}
