package com.jhonssantiago.exemplolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class TerceiraActivity extends AppCompatActivity {
    private RadioButton radioButton_01, radioButton_02, radioButton_03, radioButton_04, radioButton_05, radioButton_06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        radioButton_01 = findViewById(R.id.radioButton_1);
        radioButton_02 = findViewById(R.id.radioButton_2);
        radioButton_03 = findViewById(R.id.radioButton_3);
        radioButton_04 = findViewById(R.id.radioButton_4);
        radioButton_05 = findViewById(R.id.radioButton_5);
        radioButton_06 = findViewById(R.id.radioButton_6);
    }

    public void obterRadioClicado(View view){
        RadioButton rb = (RadioButton) view;
        boolean selecionado = rb.isChecked();

        if (view.getId() == R.id.radioButton_1){
            if(selecionado){
                radioButton_01.setText("");
                Toast.makeText(getApplicationContext(), "Errou", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.radioButton_2){
            if(selecionado){
                radioButton_02.setText("");
                Toast.makeText(getApplicationContext(), "Errou", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.radioButton_3){
            if(selecionado){
                radioButton_03.setText("");
                Toast.makeText(getApplicationContext(), "Errou", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.radioButton_4){
            if(selecionado){
                Toast.makeText(getApplicationContext(), "Acertou", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.radioButton_5){
            if(selecionado){
                radioButton_05.setText("");
                Toast.makeText(getApplicationContext(), "Errou", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.radioButton_6){
            if(selecionado){
                radioButton_06.setText("");
                Toast.makeText(getApplicationContext(), "Errou", Toast.LENGTH_SHORT).show();
            }
        }

    }
}