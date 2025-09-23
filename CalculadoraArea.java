public class CalculadoraArea {
    public double calcularArea(String tipoFigura, double[] parametros) {
        switch (tipoFigura) {
            case "circulo":
                return Math.PI * parametros[0] * parametros[0];
            case "rectangulo":
                return parametros[0] * parametros[1];
            case "triangulo":
                return (parametros[0] * parametros[1]) / 2;
            default:
                throw new IllegalArgumentException("Figura no soportada");
        }
    }
}
