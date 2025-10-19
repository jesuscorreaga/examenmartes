import java.util.Scanner;

public class armstrong2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, original, suma = 0, digito, cantidad = 0;

    System.out.println(
        "Ingrese un número de 3 o 4 cifras. El programa determinará si es un número de Armstrong.");
    num = sc.nextInt();

    // Validar rango
    if (num < 100 || num > 9999) {
      System.out.println("El número no está dentro del rango de 3 o 4 cifras.");
      return;
    }

    original = num;

    // Contar cuántos dígitos tiene el número
    int temp = num;
    while (temp > 0) {
      cantidad++;
      temp /= 10;
    }

    // Calcular la suma de las potencias de los dígitos
    temp = num;
    while (temp > 0) {
      digito = temp % 10;

      // Calcular digito^cantidad manualmente
      int potencia = 1;
      for (int i = 1; i <= cantidad; i++) {
        potencia *= digito;
      }

      suma += potencia;
      temp /= 10;
    }

    // Mostrar resultado
    if (suma == original) {
      System.out.println(original + " es un número de Armstrong.");
    } else {
      System.out.println(original + " no es un número de Armstrong.");
    }

  }
}
