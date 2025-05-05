
public class Principal {
 public static void main(String[] args) {
  calculadora calc = new calculadora();

   int suma = calc.sumar(10, 5);
   int resta = calc.restar(10, 5);
   int multiplicacion = calc.multiplicar(10, 5);
   double division = calc.dividir(10, 5);

  System.out.println("Suma: " + suma);
  System.out.println("Resta: " + resta);
  System.out.println("Multiplicación: " + multiplicacion);
  System.out.println("División: " + division);
 }
 }