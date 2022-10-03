package org.francodevs.practicasupermercado.clases;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T> {

    private List<T> productos;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProducto(T p){
        this.productos.add(p);
    }

}
