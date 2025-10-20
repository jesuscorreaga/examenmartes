import java.util.Scanner;

public class creciente14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = 0, num2 = 0, num3 = 0;
    System.out.println("Ingrese tres números enteros, el programa se reiniciara si no se ingresa en orden creciente.");

    while (true) {

      System.out.println("Número 1: ");
      num1 = sc.nextInt();

      System.out.println("Número 2: ");
      num2 = sc.nextInt();

      System.out.println("Número 3: ");
      num3 = sc.nextInt();

      if (num1 < num2 && num2 < num3) {
        System.out.println("Correcto, el programa finalizo");
      } else {
        System.out.println("No estan en orden creciente. Vuelve a ingresar los númeroes");
      }
    }

  }
}
