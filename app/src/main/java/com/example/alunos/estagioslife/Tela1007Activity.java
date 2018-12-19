package com.example.alunos.estagioslife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1007Activity extends AppCompatActivity {

    Button btnTela1007;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1007);

        btnTela1007 = (Button) findViewById(R.id.btnTela1007);
    }

    public void encerrar(View v){
        finishAffinity();
    }

}
