package com.stingrey.mismascotas.fragments;

import com.stingrey.mismascotas.adaptador.PerfilAdaptor;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public interface IPerfilFragmentView {

    public void generarLinearLayoutVertical();

    public PerfilAdaptor crearAdaptador(ArrayList<PMascotas> mascotas);

    public void inicializarAdaptadorRV(PerfilAdaptor adaptador);

}
