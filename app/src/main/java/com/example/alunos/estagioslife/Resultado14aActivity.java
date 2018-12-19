package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado14aActivity extends AppCompatActivity {

    Button btnResultado14a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado14a);

        btnResultado14a = (Button) findViewById(R.id.btnResultado14a);
    }

    public void abrirTela16(View v) {

        Intent iTela16 = new Intent(this, Tela16Activity.class);

        startActivity(iTela16);
    }
}
