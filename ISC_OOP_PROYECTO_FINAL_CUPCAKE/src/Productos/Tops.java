package Productos;

import SuperClases.Producto;

/*
    Tops es la clase para las playeras, blusas, etc. Tops is-a Producto
 */
public class Tops extends Producto {

    private String escote; //Cuello alto, redondo, corte tortuga, etc.
    private String manga; //Larga, corta, sin mangas
    private String estampado; //Liso, de rayas, imagen, animal print, etc.

    //Constructores
    public Tops(String escote, String manga, String estampado, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.escote = escote;
        this.manga = manga;
        this.estampado = estampado;
    }

    public Tops() {
        super();
        this.escote = "";
        this.manga = "";
        this.estampado = "";
    }

    //Métodos get y set
    public String getEscote() {
        return escote;
    }

    public void setEscote(String escote) {
        this.escote = escote;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getEstampado() {
        return estampado;
    }

    public void setEstampado(String estampado) {
        this.estampado = estampado;
    }

}
