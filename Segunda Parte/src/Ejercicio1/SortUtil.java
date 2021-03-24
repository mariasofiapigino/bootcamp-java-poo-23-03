package Ejercicio1;

public class SortUtil {
    public static <T> void ordenar(Precedable<T> arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].precedeA((T) arr[j + 1]) == 1) {
                    // swap arr[j+1] and arr[j]
                    T temp = (T) arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = (Precedable<T>) temp;
                }
        }
    };
}
