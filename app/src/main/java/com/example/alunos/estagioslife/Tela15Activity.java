package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela15Activity extends AppCompatActivity {

    Button btnTela15a, btnTela15b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela15);

        btnTela15a = (Button) findViewById(R.id.btnTela15a);
        btnTela15b = (Button) findViewById(R.id.btnTela15b);
    }

    public void abrirTela17(View v) {

        Intent iTela17 = new Intent(this, Tela17Activity.class);

        startActivity(iTela17);
    }

    public void abrirTela9(View v) {

        Intent iTela9 = new Intent(this, Tela9Activity.class);

        startActivity(iTela9);
    }
}
