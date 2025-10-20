import java.util.Scanner;

public class hMS11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0, horas = 0, minutos = 0, segundos = 0;

    System.out
        .println("Ingrese un valor en segundos, este programa transformara los minutos en: horas, minutos, segundos.");
    n = sc.nextInt();

    if (n < 0) {
      System.out.println("Error el número es menor a un segundo y no se puede calcular.");
      return;
    } else {
      horas = n / 3600;
      n = n % 3600;
      minutos = n / 60;
      segundos = n % 60;
    }
    
    System.out.println("Hay: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
  }
}
