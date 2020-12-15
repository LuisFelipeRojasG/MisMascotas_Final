package com.stingrey.mismascotas.adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stingrey.mismascotas.pojo.PMascotas;
import com.stingrey.mismascotas.R;

import java.util.ArrayList;

public class PerfilAdaptor extends RecyclerView.Adapter<PerfilAdaptor.PerfilViewHolder>{

    ArrayList<PMascotas> mascotas;
    //Activity activity;

    public PerfilAdaptor (ArrayList<PMascotas> mascotas){

        this.mascotas = mascotas;
    }

    //Inflar el layout y lo pasará al viewHolder para que obtenga los views
    @Override
    public PerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pefil, parent, false);
        return new PerfilViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(@NonNull PerfilAdaptor.PerfilViewHolder holder, int position) {

        PMascotas miMascota = mascotas.get(position);
        holder.ivImagenMascota.setImageResource(miMascota.getFoto());

    }

    //Cantidad de elementos que contiene la lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivImagenMascota;
        private TextView tvNombrePerro;

        public PerfilViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImagenMascota  = (ImageView) itemView.findViewById(R.id.ivImagenMascotaCV);
            tvNombrePerro     = (TextView) itemView.findViewById(R.id.tvNombrePerroCV);

        }

    }

}

