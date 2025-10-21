import java.util.Scanner;

public class primos1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0, ultimosDos = 0;

    System.out.println(
        "Ingrese un número de 3 o 4 cifras. Si los 2 últimos números consolidan un número primo, el programa calculará el factorial de dicho número.");
    num = sc.nextInt();

    // Validar rango
    if (num < 100 || num > 9999) {
      System.out.println("El número no está dentro del rango.");
      return;
    }

    // Obtener los dos últimos dígitos
    ultimosDos = num % 100; 
    System.out.println("Los últimos dos números son: " + ultimosDos);

    // Verificar si es primo
    boolean esPrimo = true;

    if (ultimosDos < 2) { 
      esPrimo = false;
    } else {
      for (int i = 2; i * i <= ultimosDos; i++) {
        if (ultimosDos % i == 0) { 
          esPrimo = false;
          break;
        }
      }
    }

    // Si es primo calcular factorial y mostrar desarrollo
    if (esPrimo) {
      System.out.println(ultimosDos + " es primo.");

      long factorial = 1;
      String expresion = ""; // para guardar la cadena 5*4*3*2*1

      for (int i = ultimosDos; i >= 1; i--) {
        factorial *= i;
        expresion += i; 
        if (i > 1) {
          expresion += "*";
        }
      }

      System.out.println("Factorial de " + ultimosDos + " = " + expresion);
      

    } else {
      System.out.println(ultimosDos + " no es primo.");
    }

  }
}
