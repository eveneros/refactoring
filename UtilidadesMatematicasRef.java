import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class UtilidadesMatematicasRef {

    // Método genérico para filtrar números según una condición
    public int[] filtrarNumeros(int limite, IntPredicate condicion) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= limite; i++) {
            if (condicion.test(i)) {
                lista.add(i);
            }
        }

        // Convertimos la lista a array
        return lista.stream().mapToInt(Integer::intValue).toArray();
    }

    // Métodos específicos reutilizando el método genérico
    public int[] encontrarMultiplos(int numero, int limite) {
        return filtrarNumeros(limite, i -> i % numero == 0);
    }

    public int[] encontrarPares(int limite) {
        return filtrarNumeros(limite, i -> i % 2 == 0);
    }
}
