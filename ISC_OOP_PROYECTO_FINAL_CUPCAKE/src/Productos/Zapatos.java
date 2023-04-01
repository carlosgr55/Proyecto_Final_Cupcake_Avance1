package Productos;

import SuperClases.Producto;

/*
    Zapatos maneja todo el tipo de calzados is-a Producto
 */
public class Zapatos extends Producto {

    private String material; //Cuero, tela, sintetico, etc.
    private String estilo; //Casual, deportivo, de vestir

    //Constructores
    public Zapatos(String material, String estilo, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.material = material;
        this.estilo = estilo;
    }

    public Zapatos() {
        super();
        this.material = "";
        this.estilo = "";
    }

    //Metodos get y set
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

}
