import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();


        char[] caracteres = cadena.toCharArray();


        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }


        String cadenaInvertida = new String(caracteres);


        System.out.println("Cadena invertida: " + cadenaInvertida);

        scanner.close();
    }
}