package util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PruebaMedianaNotas {

    @Test
    public void NumeroImpar() {
        int[] notas = {1, 2, 3, 4, 5};
        float mediana = MisArrays.medianaNotas(notas);
        assertEquals(3.0f, mediana, 0.001f); // Tolerancia de 0.001 para manejar decimales
    }

    @Test
    public void NumeroPar() {
        int[] notas = {1, 2, 3, 4};
        float mediana = MisArrays.medianaNotas(notas);
        assertEquals(2.5f, mediana, 0.001f); // Tolerancia de 0.001 para manejar decimales
    }

    @Test
    public void NotaInvalida() {
        int[] notas = {1, 2, 11, 4};
        MisArrays.medianaNotas(notas);
    }
}