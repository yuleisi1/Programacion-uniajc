import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int Y = scanner.nextInt();
        System.out.print("ingrese el valor de z:");
        int Z = scanner.nextInt();
        
        if (x > Y && Z < 20) {
            System.out.print("Ingrese un valor para p: ");
            int p = scanner.nextInt();
            System.out.println("Valor ingresado para p: " + p);
        } else {
            System.out.println("No se cumple la condición para leer p.");
        }
        
        scanner.close();
    }
}