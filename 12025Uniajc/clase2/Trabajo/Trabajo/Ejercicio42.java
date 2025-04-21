import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("ingrese el primer numero : ");
        int num1 = scanner.nextInt();
        System.out.println(" ingrese el segundo numero :");
        System.out.println("el primer numero es el mayor");
        int num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println("el primer numero es el mayor ");
        } else if (num1 < num2) {
            System.out.println("el primer numero es el mas pequeño");}
         else{
             System.out.println("ambos numeros son iguales");
             scanner.close();


            }
        }

    }

