import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
       //Declaracion de las variables para el ejercicio
       //c-> grados celsius, f -> grados farenheit
       // gradosCelsius, gradosFarenheit
       double c, f, gradosCelsius, gradosFarenheit;  

       //pedir datos por teclado
       Scanner leer = new Scanner(System.in);
       System.out.println("Digite los grados celcius");
       c = leer.nextInt();
       System.out.println("Digite los grados Farenheit");
       f = leer.nextInt();

       gradosCelsius = (f - 32.0) * (5.0/9.0);
       gradosFarenheit = c * (9.0/5.0) + 32.012;
       //Mostrar los resultados de las formulas para cada una de las conversiones
       System.out.println("ºF -> ºC : " + gradosCelsius);
       System.out.println("ºC -> ºF : " + gradosFarenheit);
       leer.close();
    }
    
}
