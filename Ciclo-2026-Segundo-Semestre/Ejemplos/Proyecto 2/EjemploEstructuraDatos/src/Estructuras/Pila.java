package Estructuras;

import Estructuras.Nodos.NodoSimple;

public class Pila {
    private NodoSimple raiz;

    public Pila(){

    }

    public void agregarNodo(Object dato){
        NodoSimple nuevo = new NodoSimple(dato);
        if (this.raiz == null){
            this.raiz = nuevo;
            return;
        }
        NodoSimple temporal = this.raiz;
        while (temporal.obtenerSiguiente() != null){
            temporal = temporal.obtenerSiguiente();
        }
        temporal.agregarNodo(nuevo);
    }

    public void imprimir(){
        NodoSimple temporal = this.raiz;
        while (temporal != null){
            System.out.println(temporal.obtenerNodo().toString());
            temporal = temporal.obtenerSiguiente();
        }
    }

    // 1,2,3,4,5
    // 6
    public Object desapilar(){
        if(this.raiz != null) {
            NodoSimple temporal = this.raiz; // 1
            NodoSimple temporal2 = null;
            while (temporal.obtenerSiguiente() != null){ // 6
                temporal2 = temporal; // 5
                temporal = temporal.obtenerSiguiente(); // 6
            }
            if(temporal2== null){
                this.raiz = null;
            }else{
                temporal2.agregarNodo(null);
            }
            return temporal.obtenerNodo();
        }
        return null;
    }

}