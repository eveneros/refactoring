public class ValidadorEmail {
    public boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
            if (atIndex <= 0) { // Debe tener '@' y no puede ser el primer carácter
            return false;
        }

        int dotIndex = email.lastIndexOf('.');
            // El punto debe estar después de '@' y debe haber al menos un carácter entre ellos
            if (dotIndex < atIndex || dotIndex == atIndex + 1) {
            return false;
        }

            // Debe haber al menos dos caracteres después del último punto
            if (email.length() - dotIndex <= 2) {
            return false;
        }

        return true;
    }
}



