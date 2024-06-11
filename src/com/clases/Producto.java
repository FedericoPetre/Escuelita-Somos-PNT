package com.clases;

public abstract class Producto implements Comparable<Producto> {
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String value){
        this.nombre = value;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int value){
        this.precio = value;
    }

    @Override
    public int compareTo(Producto p) {
        return Integer.compare(this.precio, p.getPrecio());
    }
}
