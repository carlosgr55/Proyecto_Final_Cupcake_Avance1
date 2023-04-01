package Productos;

import SuperClases.Producto;

/*
    La clase Pantalones se crea para guardar los productos de la tienda que sean
    pantalones, Pantalones is-a Producto
 */
public class Pantalones extends Producto {

    private String corte; //Recto, slim, leggins, etc.
    private String tela;  //Mezclilla, algodon, poliester, demin, etc.
    private String largo; //Short, 7/8, largo, etc.
    private String estilo; //Casual, deportivo, de vestir, etc.

    //Constructores
    public Pantalones(String corte, String tela, String largo, String estilo, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.corte = corte;
        this.tela = tela;
        this.largo = largo;
        this.estilo = estilo;
    }

    public Pantalones() {
        super();
        this.corte = "";
        this.tela = "";
        this.largo = "";
        this.estilo = "";
    }

    //Métodos get y set
    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

}
