/**
 * 1. Crear la clase FiguraGeometrica, abstracta y con el método: public abstract double
 * area();
 * 2. Sobreescribir adecuadamente el método toString. Discutir en grupo: ¿tiene sentido
 * sobreescribir el método toString en una clase abstracta?
 * 3. Crear las clases Circulo, Triangulo y Rectangulo, todas subclases de
 * FiguraGeometrica. ¿Qué error de compilación aparece? ¿Cómo lo solucionarías?
 * 4. Agregar los atributos (variables de instancia) que corresponda en cada caso y
 * sobreescribir adecuadamente el método area en todas las subclases de
 * FiguraGeometrica.
 * 5. Crear una clase utilitaria con un método estático: public static double areaPromedio
 * (FiguraGeometrica arr[]), que calcule y retorne el área promedio de las figuras
 * contenidas en el array. Crear un programa, instanciar un FiguraGeometrica[], cargarle
 * datos e invocar a areaPromedio para obtener el área promedio. Mostrar el resultado.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

package Ejercicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "area=" + area() +
                '}';
    }
}
