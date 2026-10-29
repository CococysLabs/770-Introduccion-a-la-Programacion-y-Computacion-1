package Models;

/**
 *
 * @author Diegomrza
 */
public class Persona {
    public String nombre;
    public int edad;
    public int id;
    
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
//    @Override
//    public String toString() {
//        // return "{ Edad: " + this.edad + " Nombre: " + this.nombre + " edad: " + this.edad + "}";
//        return nombre + " (" + edad + ")";
//    }
}
