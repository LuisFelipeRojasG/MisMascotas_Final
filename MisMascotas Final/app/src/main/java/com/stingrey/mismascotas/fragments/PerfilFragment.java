package com.stingrey.mismascotas.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stingrey.mismascotas.adaptador.MascotaAdaptador;
import com.stingrey.mismascotas.pojo.PMascotas;
import com.stingrey.mismascotas.R;
import com.stingrey.mismascotas.adaptador.PerfilAdaptor;
import com.stingrey.mismascotas.presentador.IPerfilFragmentPresenter;
import com.stingrey.mismascotas.presentador.PerfilFragmentPresenter;


import java.util.ArrayList;

public class PerfilFragment extends Fragment implements IPerfilFragmentView{

    private ArrayList<PMascotas> mascota;
    private RecyclerView listaMascotas;
    private IPerfilFragmentPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        //Se usara despues de organizar los Fragmnets
        listaMascotas = (RecyclerView) view.findViewById(R.id.rvPerfilMascota);
        presenter = new PerfilFragmentPresenter(this, getContext());
        generarLinearLayoutVertical();
        return view;
    }

    @Override
    public void generarLinearLayoutVertical() {
        GridLayoutManager llm = new GridLayoutManager(getActivity(), 3);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public PerfilAdaptor crearAdaptador(ArrayList<PMascotas> mascotas) {
        this.mascota = mascotas;
        PerfilAdaptor adaptador = new PerfilAdaptor(mascota);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(PerfilAdaptor adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}