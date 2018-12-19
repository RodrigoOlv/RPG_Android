package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado7aActivity extends AppCompatActivity {

    Button btnResultado7a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado7a);

        btnResultado7a = (Button) findViewById(R.id.btnResultado7a);
    }

    public void abrirTela8(View v) {

        Intent iTela8 = new Intent(this, Tela8Activity.class);

        startActivity(iTela8);
    }
}
