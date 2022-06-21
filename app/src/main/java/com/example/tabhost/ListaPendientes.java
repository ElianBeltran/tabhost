package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaPendientes extends AppCompatActivity {

    ListView listP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pendientes);
        listP= findViewById(R.id.ListPe);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Pendientes));
        listP.setAdapter(arrayAdapter);
    }
}