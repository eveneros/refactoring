public class ProcesadorTexto {
    public String procesarTexto(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                if (i % 2 == 0) {
                    resultado += Character.toUpperCase(c);
                } else {
                    resultado += Character.toLowerCase(c);
                }
            } else if (Character.isDigit(c)) {
                resultado += "*";
            } else {
                resultado += "_";
            }
        }
        return resultado;
    }
}
