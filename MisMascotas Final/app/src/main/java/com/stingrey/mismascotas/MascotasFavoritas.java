package com.stingrey.mismascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toolbar;

import com.stingrey.mismascotas.adaptador.FavoritaAdaptador;
import com.stingrey.mismascotas.adaptador.ViewPageAdapter;
import com.stingrey.mismascotas.fragments.FavoritasFragmentViewFragment;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    private RecyclerView listaMascotas1;
    private ArrayList<PMascotas> mascotaFavoritas;
    private ViewPager viewPager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        androidx.appcompat.widget.Toolbar actionBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(actionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewPagerFavoritas);

        setViewPaper(viewPager);

        /*listaMascotas1 = (RecyclerView) findViewById(R.id.rvMascotas1);
        LinearLayoutManager llm1 = new LinearLayoutManager(this);
        llm1.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas1.setLayoutManager(llm1);
        inicializarListaMascotas1();
        inicializarAdaptador1();*/

    }

    public void setViewPaper(ViewPager viewPaper) {
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapter.agregarFragment(new FavoritasFragmentViewFragment(), "Favoritas");
        viewPaper.setAdapter(viewPageAdapter);

    }

    public boolean onCreateOptionsMenu (Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);

        return true;
    }

    /*private void inicializarAdaptador1() {
        MascotaAdaptador adaptador1 = new MascotaAdaptador(mascotaFavoritas);
        listaMascotas1.setAdapter(adaptador1);

    }*/

   /* private void inicializarListaMascotas1() {

        mascotaFavoritas = new ArrayList<PMascotas>();

        mascotaFavoritas.add(new PMascotas(R.drawable.perro_05, "Candy", likes));
        mascotaFavoritas.add(new PMascotas(R.drawable.perro_04, "Buzz", likes));
        mascotaFavoritas.add(new PMascotas(R.drawable.perro_03, "Nemo", likes));
        mascotaFavoritas.add(new PMascotas(R.drawable.perro_02, "Dorry", likes));
        mascotaFavoritas.add(new PMascotas(R.drawable.perro_01, "Happy", likes));

    }*/

    private void setSupportActionBar(Toolbar miActionBar1) {

        FavoritaAdaptador adaptador1 = new FavoritaAdaptador(mascotaFavoritas);
        listaMascotas1.setAdapter(adaptador1);

    }



}