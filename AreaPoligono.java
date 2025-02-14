public class AreaPoligono {

    public static double calcularArea(String tipo, double lado1, double lado2) {
        switch (tipo.toLowerCase()) {
            case "triangulo":
                return (lado1 * lado2) / 2;
            case "cuadrado":
                return lado1 * lado1;
            case "rectangulo":
                return lado1 * lado2;
            default:
                throw new IllegalArgumentException("Polígono no soportado");
        }
    }

    public static void main(String[] args) {
        System.out.println("Área del Triángulo: " + calcularArea("triangulo", 10, 5));
        System.out.println("Área del Cuadrado: " + calcularArea("cuadrado", 4, 0));
        System.out.println("Área del Rectángulo: " + calcularArea("rectangulo", 6, 3));
    }
}