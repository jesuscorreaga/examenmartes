import java.util.Scanner;

public class maxMin6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0, max = 0, min = 0, num = 0;
    System.out.println("Sistema para encontrar el número mayor y menor de una serie de números que el usuario provee.");
    System.out.println("Ingrese la cantidad de números que desea ingresar.");
    n = sc.nextInt();

    if (n <= 0){
      System.out.println("Debe ingresar una cantidad mayor a 0.");
      return;
    }

    // Ingrese el primer número
    System.out.println("Ingrese el número 1: ");
    num = sc.nextInt();
    max = num;
    min = num;

    for (int i = 2; i <= n; i++){
      System.out.println("Ingrese el número " + i + " :");
      num = sc.nextInt();

      if(num > max){
        max = num;
      }

      if(num < min){
        min = num;
      }
    }

    System.out.println("El número mayor es: " + max);
    System.out.println("El número mayor es: " + min);
   
  }
}
