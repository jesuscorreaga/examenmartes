import java.util.Scanner;

public class binarioADecimal12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.print("Ingrese un número en binario: "); 
    String binario = sc.nextLine();

    // Verificar que solo contenga 0 y 1
    if (!binario.matches("[01]+")) { 
      System.out.println("Error: el número ingresado no es binario (solo puede contener 0 y 1).");
    } else {
      int decimal = 0;
      int potencia = 1; // representa 2^0, 2^1, 2^2...

      // Recorremos el número de derecha a izquierda
      for (int i = binario.length() - 1; i >= 0; i--) {  
        char bit = binario.charAt(i); 

        if (bit == '1') {
          decimal += potencia; // sumamos la potencia actual si hay un 1
        }

        potencia *= 2; // pasamos a la siguiente potencia de 2
      }

      System.out.println("✅ El número binario " + binario + " en decimal es: " + decimal);
    }

    sc.close();
  }
}

