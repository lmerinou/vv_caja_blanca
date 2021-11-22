package com.practica.cajablanca;


import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import jdk.nashorn.internal.runtime.ListAdapter;

public class Prueba {
    public static void main(String[] args) throws EmptyCollectionException {
        SingleLinkedListImpl<Object> lista = new SingleLinkedListImpl<>("pepe", "jaime", 2, 3, "34");
        Editor editor = new Editor();
        editor
        System.out.println(editor.size());
        System.out.println(editor.editIsEmpty());
        System.out.println(editor.getLinea(3));


    }
}
