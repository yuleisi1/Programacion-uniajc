import java.util.Scanner;

public class Ejercicio4punto1A {
    public static void main(String[] args) {
        //clase que me permite a travez del objeto "leer" solicitar
        //datos por teclado 
        Scanner leer = new Scanner(System.in);

        //se declara la variable o las variables 
        double angulo;

        System.out.print("Dijite el angulo");
        angulo = leer.nextInt ();

        //se valida si el angulo ingresado es o no es angulo recto 
        if (angulo ==90) {
            System.out.println("El angilo es un angulo recto");
        } else {
            System.err.println("El angulo NO es unangulo recto");
        }
        leer.close();    
        

    }

}