import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        Scanner scanner = new 
        Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados: ");
        double temperatura = scanner.nextDouble();
        
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullición del agua.");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua.");
        }
        
          scanner.close();
        }
}
        