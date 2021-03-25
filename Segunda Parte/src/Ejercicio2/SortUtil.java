package Ejercicio2;

public class SortUtil {
    // Ahora esta mas estandarizado
    public static <T> void ordenar(Comparable<T> arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].compareTo((T) arr[j + 1]) > 0) {
                    Comparable<T> temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    };
}
