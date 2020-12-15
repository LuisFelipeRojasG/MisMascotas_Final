package com.stingrey.mismascotas.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stingrey.mismascotas.R;
import com.stingrey.mismascotas.adaptador.FavoritaAdaptador;
import com.stingrey.mismascotas.pojo.PMascotas;
import com.stingrey.mismascotas.presentador.FavoritasViewPresenter;
import com.stingrey.mismascotas.presentador.IFavoritasViewPresenter;

import java.util.ArrayList;

public class FavoritasFragmentViewFragment extends Fragment implements IFavoritasFragmentView {

    private ArrayList<PMascotas> mascota;
    private RecyclerView listaMascotas;
    private IFavoritasViewPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorita, container, false);

        mascota = new ArrayList<PMascotas>();
        listaMascotas = (RecyclerView) view.findViewById(R.id.rvFavoritas);
        presenter = new FavoritasViewPresenter(this, getContext());
        generarLinearLayoutVertical();
        return view;

    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public FavoritaAdaptador crearAdaptador(ArrayList<PMascotas> mascotas) {

        this.mascota = mascotas;
        FavoritaAdaptador adaptador = new FavoritaAdaptador(mascota);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(FavoritaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }

}

