import java.util.Scanner;
import java.util.Calendar;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new
    Scanner(System.in);
    System.out.println("ingrese dia:");
    int dia = scanner.nextInt();
    System.out.println("ingrese el mes:");
     int mes  = scanner.nextInt();
     System.out.println("ingrese el año:");
      int año = scanner.nextInt();
    
      Calendar calendar = Calendar.getInstance();
      calendar.set(año, mes - 1, dia);
      calendar.add(Calendar.DAY_OF_MONTH, 1);

      int nuevoDia = calendar.get(Calendar.DAY_OF_MONTH);
      int nuevoMes = calendar.get(Calendar.MONTH) + 1;
      int nuevoAño = calendar.get(Calendar.YEAR);

      System.out.println("La fecha del día siguiente es: " + nuevoDia + "/" + nuevoMes + "/" + nuevoAño);

      scanner.close();
    }
}
   
    