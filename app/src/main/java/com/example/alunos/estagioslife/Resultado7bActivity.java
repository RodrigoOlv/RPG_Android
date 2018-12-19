package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado7bActivity extends AppCompatActivity {

    Button btnResultado7b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado7b);

        btnResultado7b = (Button) findViewById(R.id.btnResultado7b);
    }

    public void abrirResultado7a(View v) {

        Intent iResultado7a = new Intent(this, Resultado7aActivity.class);

        startActivity(iResultado7a);
    }
}
