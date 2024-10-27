package insertionSort;
/*
 *   Este algoritmo construye la lista ordenada de manera incremental, tomando un elemento de la lista desordenada y colocándolo en su posición correcta en la lista ordenada.
 *   Complejidad:
 *   𝑂(𝑛2)
 */

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}
