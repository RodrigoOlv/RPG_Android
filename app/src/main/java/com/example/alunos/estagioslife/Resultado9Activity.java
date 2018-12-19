package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado9Activity extends AppCompatActivity {

    Button btnResultado9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado9);

        btnResultado9 = (Button) findViewById(R.id.btnResultado9);
    }

    public void abrirTela10(View v) {

        Intent iTela10 = new Intent(this, Tela10Activity.class);

        startActivity(iTela10);
    }
}
