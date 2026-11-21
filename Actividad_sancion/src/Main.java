import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimetro=0;
        System.out.println("Ingresa el tamaño de un lado del cuadrado:");
        double lado = sc.nextDouble();
        System.out.println("Ingresa el Radio del circulo:");
        double radio = sc.nextDouble();
        System.out.println("Ingresa la base del rectangulo:");
        double base = sc.nextDouble();
        System.out.println("Ingresa la altura del rectangulo:");
        double altura = sc.nextDouble();
        System.out.println();


        Figura cuadrado = new Cuadrado(perimetro,lado,altura,base,radio);
        Figura circulo = new Circulo(perimetro,lado,altura,base,radio);
        Figura rectangulo = new Rectangulo(perimetro,lado,altura,base,radio);

        System.out.println("Perimetro del Cuadrado:"+cuadrado.calcularPerimetro());
        System.out.println("Perimetro del Circulo:"+circulo.calcularPerimetro());
        System.out.println("Perimetro del Rectangulo:"+rectangulo.calcularPerimetro());
    }
}