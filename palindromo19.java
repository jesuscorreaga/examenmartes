import java.util.Scanner;

public class palindromo19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String palabra, invertida = "";

    System.out.println("Ingrese una palabra:");
    palabra = sc.nextLine();

    // Convertir a minúsculas para evitar errores con mayúsculas
    palabra = palabra.toLowerCase();

    // Invertir la palabra
    for (int i = palabra.length() - 1; i >= 0; i--) {
      invertida += palabra.charAt(i);
    }

    // Mostrar la palabra invertida
    System.out.println("Palabra invertida: " + invertida);

    // Comparar original e invertida
    if (palabra.equals(invertida)) {
      System.out.println("La palabra '" + palabra + "' es un palíndromo.");
    } else {
      System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
    }
  }
}
