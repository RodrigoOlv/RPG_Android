package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado10aActivity extends AppCompatActivity {

    Button btnResultado10a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado10a);

        btnResultado10a = (Button) findViewById(R.id.btnResultado10a);
    }

    public void abrirResultado10b(View v) {

        Intent iResultado10b = new Intent(this, Resultado10bActivity.class);

        startActivity(iResultado10b);
    }
}
