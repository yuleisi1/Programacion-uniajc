import java.util.Scanner;

public class Ejercicio412{

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    System.out.print("Ingrese el código de selección (1: suma, 2: multiplicación, 3: división): ");
    int codigo = scanner.nextInt();

    double resultado = 0;
    boolean operacionValida = true;

    if (codigo == 1) {
        resultado = num1 + num2;
    } else if (codigo == 2) {
        resultado = num1 * num2;
    } else if (codigo == 3) {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            operacionValida = false;
        }
    } else {
        System.out.println("Código no válido.");
        operacionValida = false;
    }

    if (operacionValida) {
        System.out.println("Resultado: " + resultado);
    }

    scanner.close();
}

    
}
