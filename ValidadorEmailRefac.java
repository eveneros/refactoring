public class ValidadorEmailRefac {
    public boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
            if (atIndex <= 0) { 
            return false;
        }

        int dotIndex = email.lastIndexOf('.');
            if (dotIndex < atIndex || dotIndex == atIndex + 1) {
            return false;
        }

            if (email.length() - dotIndex <= 2) {
            return false;
        }

        return true;
    }
}



