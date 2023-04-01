package Personal;

import SuperClases.Persona;

/*
    La clase empleado sirve para almacenar informacion de las personas que laboran
    en la empresa, el cliente solicitó una forma de calcular sus vacaciones y su sueldo
    semanal
 */
public class Empleados extends Persona {

    private String empID; //ID de empleado 
    private String puesto; //Gerente, vendedor, supervisor, asesor, etc.
    private int antiguedad; //Años laborados 
    private double sueldo; //Salario

    //Constructores
    public Empleados(String empID, String puesto, int antiguedad, double sueldo, String nombre, String apellido, int edad, String telefono) {
        super(nombre, apellido, edad, telefono);
        this.empID = empID;
        this.puesto = puesto;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    public Empleados() {
        super();
        this.empID = "";
        this.puesto = "";
        this.antiguedad = 0;
        this.sueldo = 0;
    }

    //Métodos get y set
    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
