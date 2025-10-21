import java.util.Scanner;

public class flotantes16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = 0;

    while (true) {
      System.out.println("Ingrese un número con un solo decimal: "); 
      num = sc.nextDouble();


      //Se convierte en entero
      int enteroX10 = (int)  (num * 10); 
      // Separar parte entera y parte decimal
      int parteEntera = enteroX10 /10; // Parte entera 

      int parteDecimal = enteroX10 % 10; 

      System.out.println("Parte entera: " + parteEntera + " parte decimal: " + parteDecimal);

      // Verificar si la parte decimal es mayor a la entera
      if (parteDecimal > parteEntera) { 
        System.out.println("El valor decimal es mayor a la parte entera.");
        break; // Sale del bucle
      } else {
        System.out.println("Ingrese otro número este no cumple la condición.");
      }

    }
  }
}
