package com.stingrey.mismascotas.pojo;

public class PMascotas {

    private int id;
    private String nombre;
    private int foto;
    private int likes;

    public PMascotas(int foto, String nombre, int likes){

        this.foto   = foto;
        this.nombre = nombre;
        this.likes = likes;
    }
    //Segundo constructor
    public PMascotas(int foto){ this.foto   = foto; }

    public PMascotas() {

    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getFoto() { return foto; }

    public void setFoto(int foto) { this.foto = foto; }

    public int getLikes() { return likes; }

    public void setLikes(int likes) { this.likes = likes; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

}
