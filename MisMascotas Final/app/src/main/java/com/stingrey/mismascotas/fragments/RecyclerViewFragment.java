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

import com.stingrey.mismascotas.CustomItemClickListener;
import com.stingrey.mismascotas.pojo.PMascotas;
import com.stingrey.mismascotas.R;
import com.stingrey.mismascotas.adaptador.MascotaAdaptador;
import com.stingrey.mismascotas.presentador.IRecyclerViewFragmentPresenter;
import com.stingrey.mismascotas.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragmentView {

    private ArrayList<PMascotas> mascota;
    private RecyclerView listaMascotas;
    private IRecyclerViewFragmentPresenter presenter;
    private MascotaAdaptador adaptador;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycleview, container, false);

        mascota = new ArrayList<PMascotas>();
        listaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
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
    public MascotaAdaptador crearAdaptador(ArrayList<PMascotas> mascotas) {

        this.mascota = mascotas;
        adaptador = new MascotaAdaptador(mascota);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }

    //@Override
    /*public void likeClicked(View v, int position) {
        mascota.get(position).setLikes(mascota.get(position).getLikes() + 1);
        adaptador.notifyDataSetChanged();
    }*/
}
