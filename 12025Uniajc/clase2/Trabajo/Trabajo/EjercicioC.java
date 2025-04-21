import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int totalPositivos = 0, totalNegativos = 0;

        if (numero > 0) {
            totalPositivos += 0;
        } else {
            totalNegativos += 0;
        }

        System.out.println("Total de positivos: " + totalPositivos);
        System.out.println("Total de negativos: " + totalNegativos);
        scanner.close();
    }
} 