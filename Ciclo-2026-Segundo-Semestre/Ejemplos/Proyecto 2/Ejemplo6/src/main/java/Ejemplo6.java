import Estructuras.ListaSimple;
import Estructuras.ListaDoble;
import Views.VentanaLista;
import Models.Persona;

/**
 *
 * @author Diegomrza
 */
public class Ejemplo6 {

    public static void main(String[] args) {
        // ====== ListaSimple ======
        // Lista de Strings
        System.out.println("========= Lista simple de Strings =========");
        ListaSimple<String> lista = new ListaSimple<String>();
        lista.insertar("Inicio");
        lista.insertar("Intermedio");
        lista.insertar("Fin");
        lista.imprimir();
        System.out.println("=============================================");
        
        // Lista de Personas
        System.out.println("========= Lista simple de personas =========");
        ListaSimple<Persona> lista2 = new ListaSimple<Persona>();
        lista2.insertar(new Persona(1, "Diego", 28));
        lista2.insertar(new Persona(1, "Pedro", 22));
        lista2.imprimir();
        System.out.println("=============================================");
        
        ListaSimple<Integer> numeros = new ListaSimple<>();
        
        // ====== ListaDoble ======
        // Lista de Strings
        System.out.println("========= Lista doble de Strings =========");
        ListaDoble<String> lista3 = new ListaDoble<String>();
        lista3.insertar("Diego");
        lista3.insertar("Pedro");
        lista3.imprimirAdelante();
        System.out.println("=============================================");
        
        // Lista de Personas
        System.out.println("========= Lista doble de personas =========");
        ListaDoble<Persona> lista4 = new ListaDoble<Persona>();
        lista4.insertar(new Persona(0, "Diego", 28));
        lista4.insertar(new Persona(0, "Pedro", 22));
        lista4.imprimirAdelante();
        System.out.println("=============================================");

        VentanaLista<String> ventanaD = new VentanaLista<String>(lista3);
        ventanaD.setVisible(true);
        
        VentanaLista<Persona> ventanaS = new VentanaLista<Persona>(lista4);
        ventanaS.setVisible(true);
    }
}
