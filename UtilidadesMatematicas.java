public class UtilidadesMatematicas {
    public static int[] encontrarMultiplos(int numero, int limite) {
        int count = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % numero == 0) {
                count++;
            }
        }
        
        int[] resultado = new int[count];
        int index = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % numero == 0) {
                resultado[index] = i;
                index++;
            }
        }
        return resultado;
    }
    
    public static int[] encontrarPares(int limite) {
        int count = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        
        int[] resultado = new int[count];
        int index = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                resultado[index] = i;
                index++;
            }
        }
        return resultado;
    }
}

