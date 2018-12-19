package com.example.alunos.estagioslife;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1000Activity extends AppCompatActivity {

    Button btnTela1000A, btnTela1000B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1000);

        btnTela1000A = (Button) findViewById(R.id.btnTela1000A);
		btnTela1000B = (Button) findViewById(R.id.btnTela1000B);

    }

    public void abrirTela1001(View v) {

        Intent iTela1001 = new Intent(this, Tela1001Activity.class);
		
        startActivity(iTela1001);	
    }
	
	public void abrirTela1003(View v) {

        Intent iTela1003 = new Intent(this, Tela1003Activity.class);

        startActivity(iTela1003);
    }
}
