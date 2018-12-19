package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1003Activity extends AppCompatActivity {

    Button btnTela1003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1003);

        btnTela1003 = (Button) findViewById(R.id.btnTela1003);
    }

    public void abrirTela1004(View v) {

        Intent iTela1004 = new Intent(this, Tela1004Activity.class);

        startActivity(iTela1004);
    }
}
