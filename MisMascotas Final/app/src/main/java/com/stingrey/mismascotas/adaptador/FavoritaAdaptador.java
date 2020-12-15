package com.stingrey.mismascotas.adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stingrey.mismascotas.R;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public class FavoritaAdaptador extends RecyclerView.Adapter<FavoritaAdaptador.FavoritaViewHolder>{

    ArrayList<PMascotas> mascotas;

    public FavoritaAdaptador (ArrayList<PMascotas> mascotas){

        this.mascotas = mascotas;
    }

    //Inflar el layout y lo pasará al viewHolder para que obtenga los views
    @Override
    public FavoritaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new FavoritaViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(@NonNull FavoritaViewHolder holder, int position) {

        PMascotas miMascota = mascotas.get(position);
        holder.ivImagenMascota.setImageResource(miMascota.getFoto());
        holder.tvNombrePerro.setText(miMascota.getNombre());
        holder.tvNumeroHueso.setText(String.valueOf(miMascota.getLikes()));

    }

    //Cantidad de elementos que contiene la lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class FavoritaViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivImagenMascota;
        private TextView tvNombrePerro;
        private static ImageView ivHuesoBlanco;
        private TextView tvNumeroHueso;


        public FavoritaViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImagenMascota   = (ImageView) itemView.findViewById(R.id.ivImagenMascotaCV);
            tvNombrePerro     = (TextView) itemView.findViewById(R.id.tvNombrePerroCV);
            ivHuesoBlanco     = (ImageView) itemView.findViewById(R.id.ivHuesoBlancoCV);
            tvNumeroHueso     = (TextView) itemView.findViewById(R.id.tvNumeroHuesoCV);
        }

    }

}
