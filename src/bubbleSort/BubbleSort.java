package bubbleSort;

import java.util.Arrays;

/*
 *  Es uno de los algoritmos de ordenamiento más simples. Compara cada par de elementos adyacentes y los intercambia si están en el orden incorrecto. Este proceso se repite hasta que no hay más intercambios.

 *  Complejidad:
 *  𝑂(𝑛2))
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}
