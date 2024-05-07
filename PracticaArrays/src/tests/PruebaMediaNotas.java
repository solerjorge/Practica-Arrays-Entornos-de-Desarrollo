package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MiArray;

class PruebaMediaNotas 
{
    static int[] notasValidas; 
    static int[] notasNoValidas; 

    @BeforeAll
    static void setUp() throws Exception 
    {
        notasValidas = new int[]{5, 5, 5, 5, 5};
        notasNoValidas = new int[]{11, 2, -3, 4, 5};
    }

    @Test
    void testNotasValidas() 
    {
        float media = MiArray.mediaNotas(notasValidas);
        assertEquals(5, media); 
    }

    @Test
    void testNotasNoValidas() 
    {
        assertThrows(IllegalArgumentException.class, () -> {
            MiArray.mediaNotas(notasNoValidas);
        });
    }
}