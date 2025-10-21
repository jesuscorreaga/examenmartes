import java.util.Scanner;

public class tablaMultiplicar20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, limite;

    // Solicitar los valores al usuario
    System.out.println("Ingrese el número para generar su tabla de multiplicar:");
    numero = sc.nextInt(); 

    System.out.println("Ingrese el valor límite:"); 
    limite = sc.nextInt();

    // Mostrar la tabla
    System.out.println("Tabla del " + numero + " hasta " + limite + ":");
    for (int i = 1; i <= limite; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
}
