package org.francodevs.practicasupermercado.clases;

public class Main {

    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaFrutas.addProducto(new Fruta("Manzana", 250d, 1, "Roja"));
        bolsaFrutas.addProducto(new Fruta("Pera", 280d, 2, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Durazno", 360d, 1, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Sandia", 950d, 2, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Uvas", 450d, 1, "Verde"));

        bolsaLimpiezas.addProducto(new Limpieza("Limpia superficies", 670d, "Pino", 2));
        bolsaLimpiezas.addProducto(new Limpieza("Lavandina", 300d, "Ayudin", 1));
        bolsaLimpiezas.addProducto(new Limpieza("Mata Cucarachas", 1050d, "Veneno", 1));
        bolsaLimpiezas.addProducto(new Limpieza("Gel con lavandina", 0.45, "Lysoform", 1.5));
        bolsaLimpiezas.addProducto(new Limpieza("Limpia pisos", 580d, "Lavanda", 1330));

        bolsaLacteos.addProducto(new Lacteo("Leche descremada", 400d, 2, 1000));
        bolsaLacteos.addProducto(new Lacteo("Casancrem", 890d, 1, 800));
        bolsaLacteos.addProducto(new Lacteo("Queso fresco la serenísima", 450d, 1, 700));
        bolsaLacteos.addProducto(new Lacteo("Danonino", 100d, 2, 1190));
        bolsaLacteos.addProducto(new Lacteo("Manteca", 600d, 2, 2500));

        bolsaNoPerecibles.addProducto(new NoPerecible("Pate", 500d, 500, 1000));
        bolsaNoPerecibles.addProducto(new NoPerecible("Atún", 1000d, 750, 1200));
        bolsaNoPerecibles.addProducto(new NoPerecible("Fideos", 150d, 600, 900));
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 150d, 500, 1000));
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz Integral", 300d, 1000, 900));

        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("Fruta: " +  fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso: " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println();

        for (Limpieza prod : bolsaLimpiezas.getProductos()) {
            System.out.println("Producto limpieza: " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println();

        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("Lacteo: " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad: " + prod.getCantidad());
            System.out.println("Proteinas: " + prod.getProteinas());
        }

        System.out.println();

        for (NoPerecible prod : bolsaNoPerecibles.getProductos()) {
            System.out.println("Artículo no perecible: " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias: " + prod.getCalorias());
            System.out.println("Contenido: " + prod.getContenido());
        }

    }

}
