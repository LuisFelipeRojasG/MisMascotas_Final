package com.stingrey.mismascotas.fragments;

import com.stingrey.mismascotas.adaptador.FavoritaAdaptador;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public interface IFavoritasFragmentView {

    public void generarLinearLayoutVertical();

    public FavoritaAdaptador crearAdaptador(ArrayList<PMascotas> mascotas);

    public void inicializarAdaptadorRV(FavoritaAdaptador adaptador);

}
