import java.util.Scanner;

public class edad4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int diaN, mesN, añoN;
    int diaA, mesA, añoA;

    System.out.println("=== CÁLCULO DE EDAD REAL ===");

    // Pedir fecha de nacimiento
    System.out.print("Ingrese su año de nacimiento: ");
    añoN = sc.nextInt();
    System.out.print("Ingrese su mes de nacimiento (1-12): ");
    mesN = sc.nextInt();
    System.out.print("Ingrese su día de nacimiento (1-30): ");
    diaN = sc.nextInt();

    // Pedir fecha actual
    System.out.print("Ingrese el año actual: ");
    añoA = sc.nextInt();
    System.out.print("Ingrese el mes actual (1-12): ");
    mesA = sc.nextInt();
    System.out.print("Ingrese el día actual (1-30): ");
    diaA = sc.nextInt();

    // Convertir todo a días para calcular la diferencia
    int diasNacimiento = (añoN * 365) + (mesN * 30) + diaN;
    int diasActual = (añoA * 365) + (mesA * 30) + diaA;

    int diferencia = diasActual - diasNacimiento;

    // Calcular años, meses y días
    int años = diferencia / 365;
    int resto = diferencia % 365;
    int meses = resto / 30;
    int dias = resto % 30;

    // Mostrar resultado
    System.out.println("Edad real:");
    System.out.println(años + " años, " + meses + " meses y " + dias + " días.");

  
  }
}
