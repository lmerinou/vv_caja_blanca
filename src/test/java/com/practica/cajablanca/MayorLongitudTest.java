package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MayorLongitudTest {

    @BeforeEach
    public void initialization(){
        Editor editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/miTexto.txt");
    }
    @Test
    public void emptyEditor(){
        Editor editor = new Editor();
        assertThrows(EmptyCollectionException.class, editor::numPalabras);
    }

    @Test
    public void inicioVacioTest(){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(1,2,"hola") );
    }
}
