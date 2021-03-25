package Ejercicio2;

public class Celular implements Comparable<Celular> {
    private int numero;
    private String titular;

    public Celular(){}

    public Celular(String titular, int numero) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int compareTo(Celular celular) {
        if (this.numero < celular.getNumero()) return -1;
        if (this.numero == celular.getNumero()) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "titular=" + titular +
                ", numero='" + numero + '\'' +
                '}';
    }
}
