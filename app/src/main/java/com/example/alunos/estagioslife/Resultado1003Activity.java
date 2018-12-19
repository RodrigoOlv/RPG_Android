package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1003Activity extends AppCompatActivity {

    Button btnResultado1003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1003);

        btnResultado1003 = (Button) findViewById(R.id.btnResultado1003);
    }

    public void abrirTela1004(View v) {

        Intent iTela1004 = new Intent(this, Tela1004Activity.class);

        startActivity(iTela1004);
    }
}
