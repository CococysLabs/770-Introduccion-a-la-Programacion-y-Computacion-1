package Estructuras;

import Nodos.NodoSimple;

/**
 *
 * @author Diegomrza
 */
public class ListaSimple<T> {
    public NodoSimple<T> cabeza;
    
    public void insertar(T dato) {
        NodoSimple<T> nodo = new NodoSimple<T>(dato);
        
        if (this.cabeza == null) {
            this.cabeza = nodo;
            return;
        }
        
        NodoSimple<T> actual = this.cabeza;
        
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nodo;
        nodo.siguiente = null;
    }
    
    public void imprimir() {
        NodoSimple<T> actual = this.cabeza;
        
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    public void eliminar(T dato) {
        if (cabeza == null) return;
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            return;
        }
        NodoSimple<T> actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.dato.equals(dato)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}
