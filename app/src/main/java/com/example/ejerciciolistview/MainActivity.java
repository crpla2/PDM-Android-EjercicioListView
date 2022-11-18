package com.example.ejerciciolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);


    String [] numeros= new String [5];
    for(int i=0;i<5;i++){
        numeros[i]=String.valueOf(i+1);
    }
    ListView l= findViewById(R.id.lista);

    ArrayAdapter<String> adaptador;
    adaptador= new ArrayAdapter<String>(this,R.layout.fila,numeros);

    l.setOnItemClickListener(this);

    l.setAdapter(adaptador);
    }
    int suma=0;

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        suma= suma+Integer.parseInt((String) adapterView.getItemAtPosition(i));
        System.out.println(suma);
        tv.setText(String.valueOf(suma));
    }
}