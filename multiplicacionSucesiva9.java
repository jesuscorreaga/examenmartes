import java.util.Scanner;

public class multiplicacionSucesiva9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    int multiplicando = sc.nextInt();

    System.out.print("Ingrese el segundo número: ");
    int multiplicador = sc.nextInt();

    int resultado = 0;

    System.out.print("\n" + multiplicando + " x " + multiplicador + " = ");

    for (int i = 1; i <= multiplicador; i++) {
      resultado += multiplicando;
      System.out.print(multiplicando);
      if (i < multiplicador) {
        System.out.print(" + ");
      } else {
        System.out.print(" = " + resultado);
      }
    }

   
  }
}
