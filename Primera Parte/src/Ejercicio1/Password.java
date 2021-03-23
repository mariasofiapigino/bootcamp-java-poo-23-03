/**
 * 1. Crear una clase Password. El constructor debe recibir una regex (expresión regular)
 * que valide el formato requerido para la contraseña. Investigar en Internet qué
 * recursos provee Java para operar con expresiones regulares.
 * 2. Agregar el método public void setValue(String pwd) que permite asignar una
 * contraseña acorde a la requerida por la regex del punto anterior. En caso de no
 * concordar, el método debe arrojar una excepción.
 *  a. Discusión: ¿qué tipo de excepción consideras más adecuada?
 *  b. Implementar el método según lo decidido en (i).
 * 3. Escribir tres clases: PasswordFuerte, PasswordIntermedia, PasswordSimple, todas
 * deben extender a Password y hardcodear una regex acorde al nivel de seguridad que
 * el mismo nombre de la clase indica.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

package Ejercicio1;

import java.util.InvalidPropertiesFormatException;

public class Password {
    private String password;
    private String pattern;

    public Password(){}

    public Password(String pattern) {
        this.pattern = pattern;
    }

    public void setPassword(String password) throws InvalidPropertiesFormatException {
        if (!password.matches(pattern)) throw new InvalidPropertiesFormatException("Contraseña invalida");
        else this.password = password;
    }

    @Override
    public String toString() {
        return "Ejercicio1.Password{" +
                "password='" + password + '\'' +
                '}';
    }
}
