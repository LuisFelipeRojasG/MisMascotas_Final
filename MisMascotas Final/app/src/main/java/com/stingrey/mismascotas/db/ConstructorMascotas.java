package com.stingrey.mismascotas.db;

import android.content.ContentValues;
import android.content.Context;

import com.stingrey.mismascotas.R;
import com.stingrey.mismascotas.pojo.PMascotas;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    
    public ConstructorMascotas(Context context) {
        this.context = context;
        obtenerDatos();
    }

    public ArrayList<PMascotas> obtenerDatos() {

        BaseDatos db = new BaseDatos(context);
        insertarVariasMascotas(db);
        return db.obtenerTodasLasMascotas();

    }

    //Aqui se crean los valores que se enviaran al método de la base de datos
    public void insertarVariasMascotas(BaseDatos db) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Happy");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.perro_01);
        //Método de la base de datos
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Dorry");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.perro_02);
        //Método de la base de datos
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Nemo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.perro_03);
        //Método de la base de datos
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Buzz");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.perro_04);
        //Método de la base de datos
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Candy");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.perro_05);
        //Método de la base de datos
        db.insertarMascota(contentValues);
        db.close();
    }

    public void darLikeMascota(PMascotas pMascotas) {
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, pMascotas.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);

    }

    public int obtenerLikesMascotas(PMascotas pMascotas){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascotas(pMascotas);

    }
}
