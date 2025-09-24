package Calculadorav2;

public class Main {
    public static void main(String[] args) {
        CalculadoraArea calculadora = new CalculadoraArea();

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(3, 8);

        System.out.println("Área del círculo: " + calculadora.calcular(circulo));
        System.out.println("Área del rectángulo: " + calculadora.calcular(rectangulo));
        System.out.println("Área del triángulo: " + calculadora.calcular(triangulo));
    }
}
