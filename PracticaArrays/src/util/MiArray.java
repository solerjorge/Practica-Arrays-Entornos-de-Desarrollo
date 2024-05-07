package util;

public abstract class MiArray {
	/**
     * Calcula la media de los números enteros dentro del array.
     *
     * @param array El array con los números enteros del cual se calculará la media.
     * @return La media de los números que hay dentro del array.
     *         
     */
    public static float mediaNotas(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
        	if (array[i] < 0 || array[i] > 10) {
                throw new IllegalArgumentException("El número " + array[i] + " no está entre 0 y 10.");
            }
            suma += array[i];
        }
        return ((float) suma / array.length);
    }
}
