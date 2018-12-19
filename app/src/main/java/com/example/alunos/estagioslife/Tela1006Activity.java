package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1006Activity extends AppCompatActivity {

    Button btnTela1006A, btnTela1006B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1006);

        btnTela1006A = (Button) findViewById(R.id.btnTela1006A);
		btnTela1006B = (Button) findViewById(R.id.btnTela1006B);
    }

    public void abrirResultado1006a(View v) {

        Intent iResultado1006a = new Intent(this, Resultado1006aActivity.class);

        startActivity(iResultado1006a);
    }
	
	public void abrirResultado1006b(View v) {

        Intent iResultado1006b = new Intent(this, Resultado1006bActivity.class);

        startActivity(iResultado1006b);
    }
}