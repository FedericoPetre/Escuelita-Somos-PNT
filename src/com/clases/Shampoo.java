package com.clases;

public class Shampoo extends Producto {
    private int contenido;
    
    public Shampoo(String nombre, int precio, int contenido){
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(super.getNombre()).append(" /// ");
        sb.append("Contenido: ").append(this.contenido).append("ml").append(" /// ");
        sb.append("Precio: $").append(super.getPrecio());
        return sb.toString();
    }
}
