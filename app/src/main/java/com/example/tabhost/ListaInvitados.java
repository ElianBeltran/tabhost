package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaInvitados extends AppCompatActivity {

    ListView listIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_invitados);
        listIn= findViewById(R.id.listI);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Invitados));
        listIn.setAdapter(arrayAdapter);
    }
}