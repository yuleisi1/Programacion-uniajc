public class EjecutarCirculo {
    public static void main(String[] args) {

        float r = 2.3; //radio
        //creacion del objeto 
        Circulo objCirculo1 = new Circulo(r);

        System.out.println("Perimetro:" + objCirculo1.calcularPerimetro());

        System.out.println("Area:"
        + objCirculo1.calcularArea());
    }
    
}
