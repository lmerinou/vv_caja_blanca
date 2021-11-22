package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EditorTest {
    @Test
    public void emptyEditorNumPalabras(){
        Editor editor = new Editor();
        assertThrows(EmptyCollectionException.class, editor::numPalabras);
    }

    @Test
    public void inicioVacioTest(){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(1,2,"hola") );
    }
}
