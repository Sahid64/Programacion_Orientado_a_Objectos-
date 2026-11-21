import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double areaTotal = 2 * Math.PI * radio * (radio + altura);

        System.out.printf("El área total del cilindro es: %.2f%n", areaTotal);

        scanner.close();
    }
}