import java.util.Scanner;

public class dividirPrimos3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0, original = 0;
    String resultado = "";
    System.out.println("Ingrese un número de dos cifras para descomponerlo en sus factores primos.");
    num = sc.nextInt();
    // Validar que si se cumpla
    if (num > 99 || num < 10) {
      System.out.println("El número no tiene dos cifras");
      return;
    }
    original = num;
    resultado = original + " = ";

    // Descomposición en factores primos
    for (int i = 2; i <= num; i++) {
      while (num % i == 0) {
        resultado += i + "*";
        num /= i;
      }
    }
    // Agregar 1 al final
    resultado += "1";

    System.out.println(resultado);
  }

}
