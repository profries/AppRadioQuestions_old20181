package com.example.iossenac.appradioquestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void responderQuestao(View v){
        RadioGroup radioRespostas = (RadioGroup) findViewById(R.id.radioRespostas);
        int resposta = radioRespostas.getCheckedRadioButtonId();
        if(resposta == -1)
            Toast.makeText(this,"Você precisa responder a questão!", Toast.LENGTH_SHORT).show();
        else if(resposta == R.id.radioAndroid)
            Toast.makeText(this,"Certa respotas!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Resposta errada!", Toast.LENGTH_SHORT).show();
    }
}
