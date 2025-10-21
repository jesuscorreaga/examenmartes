public class Multiplos513 {
  public static void main(String[] args) {
    // Recorrer los números del 10 al 50
    for (int i = 10; i <= 50; i++) { 

      // Verificar si es múltiplo de 5
      if ( i% 5 == 0) { 

        long factorial = 1;     // Reiniciamos el factorial
        String proceso = "";    // Reiniciamos el texto de proceso

        // Calcular factorial desde i hasta 1 (en orden descendente)
        for (int j = i; j >= 1; j--) {
          factorial *= j;       // Multiplicamos cada número
          proceso += j;         // Lo agregamos al texto

          // Agregamos " x " solo si no es el último número
          if (j > 1) {
            proceso += " x ";
          }
        }

        // Mostrar resultado en formato organizado
        System.out.println(i + ":");
        System.out.println("\t" + proceso);
        System.out.println("\t= " + factorial + "\n");
      }
    }
  }
}
