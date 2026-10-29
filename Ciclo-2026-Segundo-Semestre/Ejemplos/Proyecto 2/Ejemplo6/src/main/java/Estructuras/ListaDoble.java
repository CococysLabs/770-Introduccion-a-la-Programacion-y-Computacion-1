package Estructuras;

import Nodos.NodoDoble;

/**
 *
 * @author Diegomrza
 */
public class ListaDoble<T> {
    public NodoDoble<T> cabeza;
    public NodoDoble<T> cola;
    
    public ListaDoble() {
        
    }
    
    public void insertar(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            return;
        }
        nuevo.anterior = cola;
        cola.siguiente = nuevo;
        cola = nuevo;
    }
    
    public void insertarInicio(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            return;
        }
        nuevo.siguiente = cabeza;
        cabeza.anterior = nuevo;
        cabeza = nuevo;
    }
    
    public void imprimirAdelante() {
        NodoDoble<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    public void imprimirAtras() {
        NodoDoble<T> actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }
    
    public void eliminar(T dato) {
        NodoDoble<T> actual = cabeza;
        while (actual != null && !actual.dato.equals(dato)) {
            actual = actual.siguiente;
        }
        if (actual == null) return; // no encontrado

        if (actual.anterior != null) {
            actual.anterior.siguiente = actual.siguiente;
        } else {
            cabeza = actual.siguiente; // era la cabeza
        }

        if (actual.siguiente != null) {
            actual.siguiente.anterior = actual.anterior;
        } else {
            cola = actual.anterior; // era la cola
        }
    }
}
