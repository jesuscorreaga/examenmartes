import java.util.Scanner;

public class perfecto18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un número entero positivo: ");
    int num = sc.nextInt();

    int sumaDivisores = 0;

    // Calcular la suma de divisores propios
    for (int i = 1; i < num; i++) { // hasta num - 1
      if (num % i == 0) {           // si es divisor 
        sumaDivisores += i;
      }
    }

    // Mostrar resultados
    System.out.println("Suma de divisores propios: " + sumaDivisores);

    // Verificar si es perfecto
    if (sumaDivisores == num) {
      System.out.println(num + " es un número perfecto ");
    } else {
      System.out.println(num + " no es un número perfecto ");
    }

    
  }
}
