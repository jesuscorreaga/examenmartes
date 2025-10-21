import java.util.Scanner;

public class calificaciones7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nota = 0, minima = 999, totalN = 0, promedio = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.println("Ingrese la nota del estudiante # " + i); 
      nota = sc.nextInt(); 
      totalN += nota;  
      promedio = (totalN/10);
      if (nota < minima){ 
        minima = nota; 
      }

    }
    System.out.println("El promedio fue: " + promedio);
    System.out.println("La nota minima fue: " + minima);

  }
}
