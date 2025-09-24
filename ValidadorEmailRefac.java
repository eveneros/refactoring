public class ValidadorEmailRefac {

    public boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        if (!contieneArroba(email)) {
            return false;
        }

        int indiceArroba = email.indexOf('@');
        if (!arrobaEstaEnPosicionValida(indiceArroba)) {
            return false;
        }

        String dominio = obtenerDominio(email, indiceArroba);
        if (!dominioContienePunto(dominio)) {
            return false;
        }

        if (!dominioTieneLongitudMinima(dominio)) {
            return false;
        }

        return true;
    }

    private boolean contieneArroba(String email) {
        return email.contains("@");
    }

    private boolean arrobaEstaEnPosicionValida(int indiceArroba) {
        return indiceArroba > 0;
    }

    private String obtenerDominio(String email, int indiceArroba) {
        return email.substring(indiceArroba + 1);
    }

    private boolean dominioContienePunto(String dominio) {
        return dominio.contains(".");
    }

    private boolean dominioTieneLongitudMinima(String dominio) {
        return dominio.length() >= 3;
    }
}



