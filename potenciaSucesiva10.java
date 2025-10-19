import java.util.Scanner;

public class potenciaSucesiva10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int base = 0, potencia = 0, resultado = 1;

    System.out.println("Ingrese el valor de la base.");
    base = sc.nextInt();
    System.out.println("Ingrese el valor del exponente.");
    potencia = sc.nextInt();

    System.out.print("\n" + base + " ^ " + potencia + " = ");

    for(int i = 1; i <= potencia; i++){
      resultado *= base;
      System.out.print(base);
      if(i<potencia){
        System.out.print(" ^ " );
      } else {
        System.out.print(" = " + resultado);
      }
    }

  }
}
