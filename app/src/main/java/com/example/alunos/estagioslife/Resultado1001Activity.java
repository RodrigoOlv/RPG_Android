package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado1001Activity extends AppCompatActivity {

    Button btnResultado1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1001);

        btnResultado1001 = (Button) findViewById(R.id.btnResultado1001);
		
    }

    public void abrirTela1002(View v) {

        Intent iTela1002 = new Intent(this, Tela1002Activity.class);

        startActivity(iTela1002);    
    }
}
