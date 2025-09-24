public class ValidadorEmail {
    public boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0) { // Must have '@' and it can't be the first character
            return false;
        }

        int dotIndex = email.lastIndexOf('.');
        // Dot must be after '@' and there should be at least one character between them
        if (dotIndex < atIndex || dotIndex == atIndex + 1) {
            return false;
        }

        // There must be at least two characters after the last dot
        if (email.length() - dotIndex <= 2) {
            return false;
        }

        return true;
    }
}



