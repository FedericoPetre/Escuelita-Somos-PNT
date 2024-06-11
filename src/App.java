import com.clases.Bebida;
import com.clases.Fruta;
import com.clases.Producto;
import com.clases.Shampoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
    
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Bebida("Coca-Cola Zero", 20, 1.5f));
        listaProductos.add(new Bebida("Coca-Cola", 18, 1.5f));
        listaProductos.add(new Shampoo("Shampoo Sedal", 19, 500));
        listaProductos.add(new Fruta("Frutillas", 64, "kilo"));

        Producto productoMasCaro = Collections.max(listaProductos);
        Producto productoMasBarato = Collections.min(listaProductos);

        for (Producto p : listaProductos) {
            System.out.println(p.toString());
        }
        
        System.out.println("=============================");
        System.out.println("Producto más caro: "+productoMasCaro.getNombre());
        System.out.println("Producto más barato: "+productoMasBarato.getNombre());

    }
}
