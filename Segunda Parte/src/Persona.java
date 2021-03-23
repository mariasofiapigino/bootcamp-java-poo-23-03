public class Persona implements Precedable{
    String nombre;
    int dni;

    @Override
    public int precedeA(Object o) {
        return 0;
    }
}
