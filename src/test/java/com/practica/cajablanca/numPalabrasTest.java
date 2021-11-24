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
    public void initialization() {
        editor = new Editor();
        editor.leerFichero("src/main/java/com/practica/cajablanca/miTexto.txt");
    }


    @Test
    public void camino4Test() {
        Editor editorVacio = new Editor();
        assertThrows(IllegalArgumentException.class, () -> editorVacio.numPalabras(1, 3, "Lorem"));
    }

    @DisplayName("Test parametrizados para excepciones")
    @ParameterizedTest
    @CsvSource(value = {"-1:2:Lorem", "2:-2:Lorem", "2:50:Lorem"}, delimiter = ':')
    public void excepcionesTest(int inicio, int fin, String palabra) {
        assertThrows(IllegalArgumentException.class, () ->editor.numPalabras(inicio, fin, palabra));
    }

    @DisplayName("Test parametrizados para igualdades")
    @ParameterizedTest
    @CsvSource(value = {"50:3:Lorem", "1:3:Hola","1:2:Hola"}, delimiter = ':')
    public void equalsTest(int inicio, int fin, String palabra) {
        assertEquals(0, editor.numPalabras(inicio, fin, palabra));
    }

}
