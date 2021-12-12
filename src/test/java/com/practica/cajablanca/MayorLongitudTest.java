package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MayorLongitudTest {

    Editor editor = new Editor();
    
    @Test
    public void emptyEditor(){
        Editor editorVacio = new Editor();
        assertThrows(EmptyCollectionException.class, () -> editorVacio.mayorLongitud());
    }

    @Test
    public void notEmptyEditorTest() throws EmptyCollectionException {
    	editor.leerFichero("src/main/java/com/practica/cajablanca/1Palabra.txt");
        assertEquals("tincidunt", editor.mayorLongitud());
    }
    
    @Test
    public void notEmptyEditor2Palabras() throws EmptyCollectionException {
    	editor.leerFichero("src/main/java/com/practica/cajablanca/2Lineas.txt");
        assertEquals("tincidunt", editor.mayorLongitud());
    }
    
}
