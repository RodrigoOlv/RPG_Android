package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado8aActivity extends AppCompatActivity {

    Button btnResultado8a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado8a);

        btnResultado8a = (Button) findViewById(R.id.btnResultado8a);
    }

    public void abrirTela9(View v) {

        Intent iTela9 = new Intent(this, Tela9Activity.class);
        
        startActivity(iTela9);
    }
}
