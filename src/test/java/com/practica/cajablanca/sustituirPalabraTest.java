package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class sustituirPalabraTest {

    Editor editor;
    /* @BeforeEach
    public void initialization() {
        editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/miTexto.txt");
    } */

    @Test
    public void camino1Test() { //
        Editor editorVacio = new Editor();
        assertDoesNotThrow( () -> {editorVacio.sustituirPalabra("neglegentur","NUEVA");});
    }

    @DisplayName("Test palabra sustituida")
    @Test
    public void camino3Test() throws EmptyCollectionException {
        editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/1Palabra.txt");
        editor.sustituirPalabra("tincidunt","NUEVA");
        assertEquals("NUEVA", editor.getLinea(1).getAtPos(1));
    }

    @DisplayName("Test palabra NoSustituida")
    @Test
    public void camino4Test() throws EmptyCollectionException {
        editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/1Palabra.txt");
        editor.sustituirPalabra("HOLA","NUEVA");
        assertEquals("tincidunt", editor.getLinea(1).getAtPos(1));
    }

    @DisplayName("Test sustituir y NoSustituir")
    @Test
    public void camino5Test() throws EmptyCollectionException {
        editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/2Lineas.txt");
        editor.sustituirPalabra("tincidunt","NUEVA");
        assertEquals("NUEVA", editor.getLinea(1).getAtPos(1));
        assertEquals("hola", editor.getLinea(2).getAtPos(1));
    }


}
