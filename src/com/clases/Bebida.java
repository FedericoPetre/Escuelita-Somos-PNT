package com.clases;
import java.text.DecimalFormat;

public class Bebida extends Producto{
    private float litros;

    public Bebida(String nombre, int precio, float litros){
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        DecimalFormat formatoDecimalLitros = new DecimalFormat("#0.0");
        String numeroFormateado = formatoDecimalLitros.format(this.litros);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(super.getNombre()).append(" /// ");
        sb.append("Litros: ").append(numeroFormateado).append(" /// ");
        sb.append("Precio: $").append(super.getPrecio());
        return sb.toString();
    }

}
