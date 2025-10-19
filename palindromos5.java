public class palindromos5 {
  public static void main(String[] args) {

    int contador = 0;
    System.out.println("Números palíndromos entre 50 y 200:");

    // Recorrer números del 50 al 200
    for (int num = 50; num <= 200; num++) {
      int original = num;
      int invertido = 0;
      int temp = num;

      // Invertir el número
      while (temp > 0) {
        int digito = temp % 10;
        invertido = invertido * 10 + digito;
        temp /= 10;
      }

      // Comparar original con su inverso
      if (original == invertido) {
        System.out.print(original + " ");
        contador++;
      }
    }

    System.out.println("\n\nCantidad total de números palíndromos: " + contador);
  }
}
