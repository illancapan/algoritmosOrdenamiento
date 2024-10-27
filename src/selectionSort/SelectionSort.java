package selectionSort;

/*
 *   Este algoritmo divide la lista en dos partes: la parte ordenada y la parte desordenada. Repeatedly selecciona el elemento más pequeño de la parte desordenada y lo mueve a la parte ordenada.
 *   Complejidad:
 *   𝑂(𝑛2)
 */

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

}
