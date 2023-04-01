package Productos;

import SuperClases.Producto;

/*
    Vestidos maneja todo el tipo de Vestidos is-a Producto
 */
public class Vestidos extends Producto {

    private String largo; //Corto, mediano, largo
    private String escote; //Redonod, corte V, etc
    private String estampado; //Florar, liso, rayas, etc.

    //Constructores
    public Vestidos(String largo, String escote, String estampado, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.largo = largo;
        this.escote = escote;
        this.estampado = estampado;
    }

    public Vestidos() {
        super();
        this.largo = "";
        this.escote = "";
        this.estampado = "";
    }

    //Métodos get y set
    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getEscote() {
        return escote;
    }

    public void setEscote(String escote) {
        this.escote = escote;
    }

    public String getEstampado() {
        return estampado;
    }

    public void setEstampado(String estampado) {
        this.estampado = estampado;
    }

}
