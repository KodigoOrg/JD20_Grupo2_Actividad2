import AlgoritmoOrdenamiento.Quicksort;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] desordenado = {34, 7, 23, 32, 5, 62};

        int[] ordenado = Quicksort.quickSort(desordenado);

        System.out.println("Original: " + Arrays.toString(desordenado));
        System.out.println("Ordenado: " + Arrays.toString(ordenado));
    }
}