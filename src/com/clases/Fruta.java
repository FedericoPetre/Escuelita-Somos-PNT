package com.clases;

public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta(String nombre, int precio, String unidadDeVenta){
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(super.getNombre()).append(" /// ");
        sb.append("Precio: $").append(super.getPrecio()).append(" /// ");;
        sb.append("Unidad de venta: ").append(this.unidadDeVenta);
        return sb.toString();
    }
}
