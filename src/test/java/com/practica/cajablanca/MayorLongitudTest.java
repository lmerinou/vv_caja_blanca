package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MayorLongitudTest {

    Editor editor = new Editor();

    @BeforeEach
    public void initialization(){
        editor.leerFichero("src/main/java/com/practica/cajablanca/miTexto.txt");
    }
    @Test
    public void emptyEditor(){
        Editor editorVacio = new Editor();
        assertThrows(EmptyCollectionException.class, () -> editorVacio.mayorLongitud());
    }

    @Test
    public void notEmptyEditorTest() throws EmptyCollectionException {
        String mayorElem = "conclusionemque";
        assertEquals(mayorElem.length(), editor.mayorLongitud().length());
    }
}
