package br.com.apps.rameda.recycleview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.apps.rameda.recycleview.Adapter.AdapterP;
import br.com.apps.rameda.recycleview.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerPrincipal =findViewById(R.id.rv_principal);
        AdapterP adapterP = new AdapterP();


        //Configurar Recycle

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerPrincipal.setLayoutManager(layoutManager);
        recyclerPrincipal.setAdapter(adapterP);

        recyclerPrincipal.setHasFixedSize(true);
    }
    //criar adaptador



}
