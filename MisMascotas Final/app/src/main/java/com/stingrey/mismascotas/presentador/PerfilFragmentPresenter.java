package com.stingrey.mismascotas.presentador;

import android.content.Context;

import com.stingrey.mismascotas.db.ConstructorMascotas;
import com.stingrey.mismascotas.fragments.IPerfilFragmentView;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public class PerfilFragmentPresenter implements IPerfilFragmentPresenter{

    private IPerfilFragmentView iPerfilFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<PMascotas> mascotas;

    public PerfilFragmentPresenter(IPerfilFragmentView iPerfilFragmentView, Context context) {

        this.iPerfilFragmentView = iPerfilFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iPerfilFragmentView.inicializarAdaptadorRV(iPerfilFragmentView.crearAdaptador(mascotas));
    }
}
