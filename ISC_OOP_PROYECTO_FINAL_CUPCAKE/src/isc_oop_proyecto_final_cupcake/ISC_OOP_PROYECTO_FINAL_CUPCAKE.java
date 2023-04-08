package isc_oop_proyecto_final_cupcake;

import Personal.*;
import Productos.*;

public class ISC_OOP_PROYECTO_FINAL_CUPCAKE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pantalones pant = new Pantalones();
        pant.guardarProductos();
        System.out.println(pant.invPantalones);

    }
}
