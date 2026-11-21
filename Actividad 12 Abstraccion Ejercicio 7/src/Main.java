import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radio = sc.nextDouble();

        Circulo tuCirculo = new Circulo(radio);
        tuCirculo.calcularArea();
        tuCirculo.calcularCircunferencia();
    }
}