package com.example.alunos.estagioslife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1002Activity extends AppCompatActivity {

    Button btnTela1002;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1002);

        btnTela1002 = (Button) findViewById(R.id.btnTela1002);

    }

    public void abrirTela1007(View v) {

        Intent iTela1007 = new Intent(this, Tela1007Activity.class);
        startActivity(iTela1007);
    }

}
