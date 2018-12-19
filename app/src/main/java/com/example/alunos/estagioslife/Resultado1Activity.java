package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;

public class Resultado1Activity extends AppCompatActivity {

    Button btnResultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1);

        btnResultado1 = (Button) findViewById(R.id.btnResultado1);
    }

    public void abrirTela2(View v) {

        Intent iTela2 = new Intent(this, Tela2Activity.class);

        startActivity(iTela2);
    }
}
