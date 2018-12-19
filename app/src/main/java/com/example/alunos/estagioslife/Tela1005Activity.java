package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1005Activity extends AppCompatActivity {

    Button btnTela1005A, btnTela1005B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1005);

        btnTela1005A = (Button) findViewById(R.id.btnTela1005A);
		btnTela1005B = (Button) findViewById(R.id.btnTela1005B);
    }

    public void abrirResultado1005a(View v) {

        Intent iResultado1005a = new Intent(this, Resultado1005aActivity.class);

        startActivity(iResultado1005a);
    }
	
	public void abrirResultado1005b(View v) {

        Intent iResultado1005b = new Intent(this, Resultado1005bActivity.class);

        startActivity(iResultado1005b);
    }
}