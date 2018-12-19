package com.example.alunos.estagioslife;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AberturaActivity extends AppCompatActivity {

    Button btnComecar;
    MediaPlayer mpMusica1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);

        btnComecar = (Button) findViewById(R.id.btnComecar);

        mpMusica1 = MediaPlayer.create(this,R.raw.downinahole);
        mpMusica1.start();
        mpMusica1.setLooping(true);
    }

    public void abrirTela1(View v) {

        Intent iTela1 = new Intent(this, Tela1Activity.class);

        startActivity(iTela1);
    }
}


