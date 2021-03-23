package Ejercicio1;

public class PasswordSimple extends Password{

    /*
        (?=.*[0-9]) a digit must occur at least once
        (?=.*[a-z]) a lower case letter must occur at least once
        (?=\\S+$) no whitespace allowed in the entire string
        .{8,} at least 8 characters
    */

    public PasswordSimple() {
        super(".{8,}");
    }
}
