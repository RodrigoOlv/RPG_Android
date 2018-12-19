package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1002Activity extends AppCompatActivity {

    Button btnResultado1002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1002);

        btnResultado1002 = (Button) findViewById(R.id.btnResultado1002);
    }

    public void abrirTela1003(View v) {

        Intent iTela1003 = new Intent(this, Tela1003Activity.class);

        startActivity(iTela1003);
    }
}
