package Ejercicio2;

public class main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.toString());

        Triangulo triangulo = new Triangulo(30, 10);
        System.out.println(triangulo.toString());

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Circulo(10);
        figuras[1] = new Rectangulo(15, 15);
        figuras[2] = new Triangulo(15, 15);



        double total = FiguraUtil.areaPromedio(figuras);
        System.out.println("El total es: " + total);
    }
}
