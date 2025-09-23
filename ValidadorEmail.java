public class ValidadorEmail {
    public boolean validarEmail(String email) {
        if (email != null) {
            if (email.contains("@")) {
                int indexArroba = email.indexOf("@");
                if (indexArroba > 0) {
                    String dominio = email.substring(indexArroba + 1);
                    if (dominio.contains(".")) {
                        if (email.length() - indexArroba > 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

