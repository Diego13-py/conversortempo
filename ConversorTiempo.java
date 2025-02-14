import java.util.Scanner;

public class ConversorTiempo {
    public static long convertirAMilisegundos(int dias, int horas, int minutos, int segundos) {
        return ((dias * 24L + horas) * 60 + minutos) * 60 * 1000 + segundos * 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los dias:");
        int dias = scanner.nextInt();

        System.out.println("Ingrese las horas:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese los minutos:");
        int minutos = scanner.nextInt();

        System.out.println("Ingrese los segundos:");
        int segundos = scanner.nextInt();

        long resultado = convertirAMilisegundos(dias, horas, minutos, segundos);
        System.out.println("El tiempo total en milisegundos es: " + resultado);

        scanner.close();
    }
}