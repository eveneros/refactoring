public class ProcesadorTextoRef {

    public String procesarTexto(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            resultado.append(transformarCaracter(caracter, i));
        }

        return resultado.toString();
    }

    private String transformarCaracter(char caracter, int posicion) {
        if (Character.isLetter(caracter)) {
            return transformarLetra(caracter, posicion);
        }
        if (Character.isDigit(caracter)) {
            return "*";
        }
        return "_";
    }

    private String transformarLetra(char letra, int posicion) {
        return (posicion % 2 == 0)
                ? String.valueOf(Character.toUpperCase(letra))
                : String.valueOf(Character.toLowerCase(letra));
    }
}