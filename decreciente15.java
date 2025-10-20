import java.util.Scanner;

public class decreciente15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = 0, num2 = 0, num3 = 0;
    System.out.println("Ingrese los números en orden decreciente, el programa se repetira si no esta en ese orden.");
    while (true) {
      System.out.println("Ingrese el número # 1: ");
      num1 = sc.nextInt();
      System.out.println("Ingrese el número # 2: ");
      num2 = sc.nextInt();
      System.out.println("Ingrese el número # 3: ");
      num3 = sc.nextInt();
      if (num1 > num2 && num2 > num3) {
        System.out.println("El programa finalizo");
        break;
      } else {
        System.out.println("Los números no estan en orden decreciente.");
      }
      
    }
  }
}