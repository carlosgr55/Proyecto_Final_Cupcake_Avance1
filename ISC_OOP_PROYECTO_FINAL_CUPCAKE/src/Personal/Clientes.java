package Personal;

import SuperClases.Persona;

/*
    La clase clientes maneja la informacion relacionada a los usuarios esta maneja
    datos relacionados a sus direcciones de entrega, facturacion, y medios de contacto
    En este archivo, igualmente, se encuentra la clase Direccion para guardar estos datos del usuario
 */
public class Clientes extends Persona {

    private String clientID; //ID para identificar al cliente, 
    private String email; //Medio de contacto para el cliente
    private Direccion dirFact; //Dirección de facturacion
    private Direccion dirEnvio; //Dirección de envíos de los productos
    
    //Constructores

    public Clientes(String clientID, String email, Direccion dirFact, Direccion dirEnvio, String nombre, String apellido, int edad, String telefono) {
        super(nombre, apellido, edad, telefono);
        this.clientID = clientID;
        this.email = email;
        this.dirFact = dirFact;
        this.dirEnvio = dirEnvio;
    }

    public Clientes() {
        super();
        this.clientID = "";
        this.email = "";
        this.dirFact = null;
        this.dirEnvio = null;
    }
    

    //Métodos get y set

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDirFact() {
        return dirFact;
    }

    public void setDirFact(Direccion dirFact) {
        this.dirFact = dirFact;
    }

    public Direccion getDirEnvio() {
        return dirEnvio;
    }

    public void setDirEnvio(Direccion dirEnvio) {
        this.dirEnvio = dirEnvio;
    }
    
}

//La clase direccion se crea aparte 
class Direccion {

    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    //Constructores
    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
    }

    //Métodos get y set
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
