package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1006aActivity extends AppCompatActivity {

    Button btnResultado1006a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1006a);

        btnResultado1006a = (Button) findViewById(R.id.btnResultado1006a);
    }

    public void abrirTela1002(View v) {

        Intent iTela1002 = new Intent(this, Tela1002Activity.class);

        startActivity(iTela1002);
    }
}
