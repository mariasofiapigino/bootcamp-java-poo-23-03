package Ejercicio2;

public class FiguraUtil {
    public static double areaPromedio(FiguraGeometrica arr[]){
        double total = 0;
        for (FiguraGeometrica figura: arr) {
            total += figura.area();
        }
        return total/arr.length;
    }
}
