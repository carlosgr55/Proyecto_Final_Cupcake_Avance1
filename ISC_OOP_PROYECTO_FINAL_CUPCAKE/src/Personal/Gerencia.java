package Personal;

import java.util.ArrayList;
import Personal.Empleados;

/*
Gerencia tiene los mismos atributos que un empleado, pero si tienen el puesto
de gerente o supervisor, tienen métodos que el resto de los empleados no.
 */
public class Gerencia extends Empleados {

    private ArrayList<String> puestosAut = new ArrayList<>();

    
    public boolean isAutorizado(String puesto){
        puestosAut.add("Gerente");
        puestosAut.add("Supervisor");
        return puestosAut.contains(puesto);
    }
    
}
