import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int central;
        if (num1 > num2 && num1 < num3)
        if (num1 < num2 && num1 > num3){
            central = num1;
        } else if (num2 > num1 && num2 < num3)
        if (num2 < num1 && num2 > num3) {
            central = num2;
        } else {
            central = num3;
        }

         System.out.println("El número central es: " );
        scanner.close();
    }
}

