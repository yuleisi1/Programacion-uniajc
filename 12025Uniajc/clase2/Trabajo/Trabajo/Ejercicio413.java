import java.util.Scanner;

public class Ejercicio413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número de mes (1-12): ");
        int mes = scanner.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println(" Mes invalido.");
        } else {
            System.out.print("Introduzca un día del mes: ");
            int dia = scanner.nextInt();
                System.out.println("Fecha ingresada: " + dia + "/" + mes);
            
        }

     scanner.close();
    }}

    
