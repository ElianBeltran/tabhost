package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost= getTabHost();
        TabHost.TabSpec spec1 = tabhost.newTabSpec("tab1");
        spec1.setIndicator("Invitados");
        Intent intentI= new Intent(this, ListaInvitados.class);
        spec1.setContent(intentI);
        tabhost.addTab(spec1);

        TabHost.TabSpec spec2 = tabhost.newTabSpec("tab2");
        spec2.setIndicator("Pendientes");
        Intent intentP= new Intent(this, ListaPendientes.class);
        spec2.setContent(intentP);
        tabhost.addTab(spec2);

    }
}