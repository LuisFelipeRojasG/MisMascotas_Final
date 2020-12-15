package com.stingrey.mismascotas.fragments;

import com.stingrey.mismascotas.adaptador.MascotaAdaptador;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<PMascotas> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
