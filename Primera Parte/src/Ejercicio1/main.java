package Ejercicio1;

import java.util.InvalidPropertiesFormatException;

public class main {
    public static void main(String[] args) throws InvalidPropertiesFormatException {
        System.out.println(" - Ejercicio 1 - ");
        Password password = new PasswordFuerte();
        password.setPassword("23addsasdDDD#");
        System.out.println(password.toString());

        Password password1 = new PasswordIntermedia();
        password1.setPassword("3sgsgsHssss");
        System.out.println(password1.toString());

        Password password2 = new PasswordSimple();
        password2.setPassword("3dadaahh");
        System.out.println(password2);

        Password password3 = new PasswordIntermedia();
        password3.setPassword("3");
        System.out.println(password3.toString());


    }
}
