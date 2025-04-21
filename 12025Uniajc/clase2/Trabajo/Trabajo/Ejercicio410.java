import java.util.Scanner;

public class Ejercicio410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica: ");
        int calificacion = scanner.nextInt();

        char grado;
        if (calificacion >= 90) {
            grado = 'A';
        } else if (calificacion >= 80) {
            grado = 'B';
        } else if (calificacion >= 70) {
            grado = 'C';
        } else if (calificacion >= 69) {
            grado = 'D';
        } else {
            grado = 'F';
        }

        System.out.println("La calificación en letra es: " + grado);

         scanner.close();
        }
}
