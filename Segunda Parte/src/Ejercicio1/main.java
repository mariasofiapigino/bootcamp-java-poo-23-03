package Ejercicio1;

public class main {
    public static void main(String[] args) {
        System.out.println(" - Persona - ");
        Persona[] arrayPersonas = new Persona[4];
        arrayPersonas[0] = new Persona("Sofia", 41349476);
        arrayPersonas[1] = new Persona("Santiago", 39936798);
        arrayPersonas[2] = new Persona("Valentina", 43569856);
        arrayPersonas[3] = new Persona("Juan", 41349476);

        SortUtil.ordenar(arrayPersonas);
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println(arrayPersonas[i].toString());
        }

        System.out.println(" - Celular - ");
        Celular[] arrayCelulares = new Celular[4];
        arrayCelulares[0] = new Celular("Sofia", 351802836);
        arrayCelulares[1] = new Celular("Santiago", 351000039);
        arrayCelulares[2] = new Celular("Valentina", 351806045);
        arrayCelulares[3] = new Celular("Juan", 351000039);

        SortUtil.ordenar(arrayCelulares);
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println(arrayCelulares[i].toString());
        }
    }
}
