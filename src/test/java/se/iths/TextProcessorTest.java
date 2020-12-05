package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextProcessorTest {

    @AfterEach
    void afterEachTest(){
        System.out.println("Körs efter varje test");
    }

    @DisplayName("Testar upperCase i TextProcessor-klassen")
    @Test
    void testUpperCase(){
        TextProcessor textProcessor = new TextProcessor();
        assertTrue("HEJ".equals(textProcessor.upperCase("hEj")));
    }

    @DisplayName("Testar att lowerCase inte returnerar null i TextProcessor-klassen")
    @Test
    void testLowerCase(){
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull((textProcessor.lowerCase("hEj")));
    }

    @DisplayName("Testar reverse i TextProcessor-klassen")
    @Test
    void testReverse(){
        TextProcessor textProcessor = new TextProcessor();
        assertFalse("HEJ".equals(textProcessor.reverse("HEJ")));
    }
}
