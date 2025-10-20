import java.util.Scanner;

public class sumaParImpar17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sumaPares = 0, sumaImpar = 0, digito = 0;
    System.out.println("Ingrese un número entero para sumar de manera divida los pares y los impares.");
    int num = sc.nextInt();

    // Este ciclo recorre cada digito
    while (num > 0) {
      digito = num % 10; // obtiene el ultimo digito

      if (digito % 2 == 0) {
        sumaPares += digito;
      } else {
        sumaImpar += digito;
      }
      num /= 10; // Elimina el ultimo digito
    }
    System.out.println("La suma de los números pares es: " + sumaPares);
    System.out.println("La suma de los números impares es: " + sumaImpar);

    if (sumaPares > sumaImpar) {
      System.out.println("La suma de los pares es mayor que los impares.");
    } else if (sumaImpar > sumaPares) {
      System.out.println("La suma de los impares es mayor que los impares.");
    } else {
      System.out.println("Son iguales.");
    }
  }
}