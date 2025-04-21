import java.util.Scanner;

public class Ejercicio49 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un ángulo en grados: ");
        int angulo = scanner.nextInt();

        if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else {
            System.out.println("El ángulo es obtuso.");
        }

        scanner.close();
    }
}
