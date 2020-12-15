package com.stingrey.mismascotas.presentador;

import android.content.Context;

import com.stingrey.mismascotas.db.ConstructorMascotas;
import com.stingrey.mismascotas.fragments.IFavoritasFragmentView;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public class FavoritasViewPresenter implements IFavoritasViewPresenter {

    private IFavoritasFragmentView iFavoritasFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<PMascotas> mascotas;

    public FavoritasViewPresenter(IFavoritasFragmentView iFavoritasFragmentView, Context context) {
        this.iFavoritasFragmentView = iFavoritasFragmentView;
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
        iFavoritasFragmentView.inicializarAdaptadorRV(iFavoritasFragmentView.crearAdaptador(mascotas));
    }
}
