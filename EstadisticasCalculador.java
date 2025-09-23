public class EstadisticasCalculador {
    public void calcularYImprimirEstadisticas(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;
        
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) max = numeros[i];
            if (numeros[i] < min) min = numeros[i];
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
