package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado11aActivity extends AppCompatActivity {

    Button btnResultado11a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado11a);

        btnResultado11a = (Button) findViewById(R.id.btnResultado11a);
    }

    public void abrirResultado11b(View v) {

        Intent iResultado11b = new Intent(this, Resultado11bActivity.class);

        startActivity(iResultado11b);
    }
}
