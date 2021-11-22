package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class numPalabrasTest {

    Editor editor;

    @BeforeEach
    public void initialization(){
        editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/miTexto.txt");
    }

    @Test
    public void emptyEditorNumPalabras(){
        Editor editor = new Editor();
        assertThrows(EmptyCollectionException.class, editor::numPalabras);
    }

    @Test
    public void lineaInicioTest(){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(-1,2,"Lorem") );
    }
    @Test
    public void lineaFinTest(){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(2,-2,"Lorem") );
    }
    @Test
    public void lineaInicioMaxTest(){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(50,-2,"Lorem") );
    }
    @DisplayName("Test parameterizados linea de inicio y fin")
    @ParameterizedTest
    @CsvSource(value = {"-1:2:Lorem", "2:-2:Lorem", "50:3:Lorem"}, delimiter = ':')
    public void elementoTest(int inicio, int fin, String palabra) {
        assertThrows(IllegalArgumentException.class, () ->editor.numPalabras(inicio, fin, palabra));
    }

    @Test
    public void noEncuentraPalabraTest(){
        assertEquals(0, editor.numPalabras(1,2,"Hola"));
    }
}
