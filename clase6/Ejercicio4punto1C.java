import java.util.Scanner;

public class Ejercicio4punto1C {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero;
        int total_positivos = 0;
        int total_negativos = 0;
        System.out.println("introduce numero");
        numero = leer.nextInt();
        if (numero > 0) {
            System.out.println("suma total de positivos");
        } else {
            System.out.println("sum total de negativos");
        }
        leer.close();

    }
}
