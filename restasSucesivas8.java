import java.util.Scanner;

public class restasSucesivas8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el dividendo: ");
    int dividendo = sc.nextInt();

    System.out.print("Ingrese el divisor: ");
    int divisor = sc.nextInt();

    if (divisor == 0) {
      System.out.println("Error: no se puede dividir entre cero.");
      return;
    }

    int cociente = 0;
    int residuo = dividendo;

    System.out.print("\nProceso: " + dividendo);

    // Restas sucesivas
    while (residuo >= divisor) {
      System.out.print(" - " + divisor);
      residuo -= divisor;
      cociente++;
    }

    System.out.println(" = " + residuo);
    System.out.println("Cociente = " + cociente);
    System.out.println("Residuo = " + residuo);

    
  }
}
