
public class EstadisticasCalculadorR {

    public void calcularYImprimirEstadisticas(int[] valores) {
        int suma = calcularSuma(valores);
        double promedio = calcularPromedio(valores, suma);
        int maximo = calcularMaximo(valores);
        int minimo = calcularMinimo(valores);

        imprimirResultados(suma, promedio, maximo, minimo);
    }

    private int calcularSuma(int[] valores) {
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        return suma;
    }

    private double calcularPromedio(int[] valores, int suma) {
        return (double) suma / valores.length;
    }

    private int calcularMaximo(int[] valores) {
        int max = valores[0];
        for (int valor : valores) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    }

    private int calcularMinimo(int[] valores) {
        int min = valores[0];
        for (int valor : valores) {
            if (valor < min) {
                min = valor;
            }
        }
        return min;
    }

    private void imprimirResultados(int suma, double promedio, int maximo, int minimo) {
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
