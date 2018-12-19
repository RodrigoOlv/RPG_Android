package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado8bActivity extends AppCompatActivity {

    Button btnResultado8b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado8b);

        btnResultado8b = (Button) findViewById(R.id.btnResultado8b);
    }

    public void abrirTela8(View v) {

        Intent iTela8 = new Intent(this,Tela8Activity.class);

        startActivity(iTela8);
    }
}
