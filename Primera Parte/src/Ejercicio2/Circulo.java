package Ejercicio2;

public class Circulo extends FiguraGeometrica{
    private double r;

    public Circulo(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
