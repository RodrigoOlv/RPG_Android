package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1005aActivity extends AppCompatActivity {

    Button btnResultado1005a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1005a);

        btnResultado1005a = (Button) findViewById(R.id.btnResultado1005a);
    }

    public void abrirResultado1005b(View v) {

        Intent iResultado1005b = new Intent(this, Resultado1005bActivity.class);

        startActivity(iResultado1005b);
    }
}
