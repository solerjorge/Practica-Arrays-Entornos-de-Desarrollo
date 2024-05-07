package util;

import java.util.Arrays;

/**
 * Clase abstracta que contiene métodos para el manejo de arrays de notas.
 */
public abstract class MisArrays {

    /**
     * Calcula la media de un array de notas.
     *
     * @param notas Array de números enteros entre 0 y 10.
     * @return La media de las notas.
     * @throws IllegalArgumentException Si alguna nota no está entre 0 y 10.
     */
    public static float mediaNotas(int[] notas) {
        validarNotas(notas);
        int sum = Arrays.stream(notas).sum();
        return (float) sum / notas.length;
    }

    /**
     * Calcula la mediana de un array de notas.
     *
     * @param notas Array de números enteros entre 0 y 10.
     * @return La mediana de las notas.
     * @throws IllegalArgumentException Si alguna nota no está entre 0 y 10.
     */
    public static float medianaNotas(int[] notas) {
        validarNotas(notas);
        Arrays.sort(notas);
        int n = notas.length;
        if (n % 2 == 0) {
            return (float) (notas[n / 2] + notas[(n / 2) - 1]) / 2;
        } else {
            return notas[n / 2];
        }
    }

