package br.com.apps.rameda.recycleview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

import br.com.apps.rameda.recycleview.R;

public class AdapterP extends RecyclerView.Adapter<AdapterP.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemLista =LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista,parent,false );
        return new MyViewHolder(itemLista);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.titulo.setText("CAPITAO AMERICA");
        myViewHolder.ano.setText("2016");
        myViewHolder.genero.setText("ação");
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titulo,ano,genero;
        //guarda formato do viewHolder
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tv_titulo);
            ano = itemView.findViewById(R.id.tv_ano);
            genero = itemView.findViewById(R.id.tv_genero);

        }
    }
}
