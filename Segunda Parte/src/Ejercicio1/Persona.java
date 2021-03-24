/**
 * 1. Crear la interface Precedable<T> con un método public int precedeA(T t).
 * 2. Crear la clase Persona, con los atributos String nombre, e int dni, sus métodos de
 * acceso y los constructores que consideres adecuados.
 * 3. Hacer que Persona implemente Precedable<Persona>, luego sobreescribir el método
 * int precedeA(Persona t).
 * 4. Establecer un criterio de precedencia para implementar el método anterior. Podría ser
 * que una persona precede a otra si su DNI es menor, o su nombre es alfabéticamente
 * menor, etcétera.
 * 5. Crear la clase SortUtil con el método public static <T> ordenar(Precedable<T> arr[]).
 * 6. Dentro del método anterior desarrollar el algoritmo de la burbuja para ordenar el
 * array.
 * 7. Discusión: El método ordenar, ¿puede ordenar un array de cualquier tipo de dato?
 * 8. Crear un programa, declarar un array con varias personas, ordenarlo y mostrarlo.
 * 9. Crear la clase Celular, con los atributos: numero y titular, implementar
 * Precedable<Celular> y proceder del mismo modo que lo hicimos con Persona a partir
 * del punto anterior.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

package Ejercicio1;

public class Persona implements Precedable<Persona>{
    String nombre;
    int dni;

    public Persona(){}

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona t) {
        if (this.dni < t.getDni()) return -1;
        if (this.dni == t.getDni()) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
