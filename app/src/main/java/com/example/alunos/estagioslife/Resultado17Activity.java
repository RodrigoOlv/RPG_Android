package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado17Activity extends AppCompatActivity {

    Button btnResultado17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado17);

        btnResultado17 = (Button) findViewById(R.id.btnResultado17);
    }

    public void abrirTela1000(View v) {

        Intent iTela1000 = new Intent(this, Tela1000Activity.class);

        startActivity(iTela1000);
    }
}
