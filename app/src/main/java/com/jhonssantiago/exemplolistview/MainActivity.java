package com.jhonssantiago.exemplolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView_Linguagens;
    private ArrayList<String> lista_dados;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView_Linguagens = findViewById(R.id.listViewLinguagens);
        preencherLista();
        preencherAdapter();
        listView_Linguagens.setOnItemClickListener(this);

    }

    private void preencherLista(){
        lista_dados = new ArrayList<>();
        lista_dados.add("C");
        lista_dados.add("Java");
        lista_dados.add("Kotlin");
        lista_dados.add("LUA");
        lista_dados.add("Python");
        lista_dados.add("PHP");
    }

    private void preencherAdapter(){
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, lista_dados);
        listView_Linguagens.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = (String) adapterView.getItemAtPosition(i);
        Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT).show();
    }
}