import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.println("Ingresa la altura: ");
        double altura = sc.nextDouble();
        if (base<0||altura<0){
            System.out.println("Error, numero negativo ingresado");
            return;
        }
        Rectungulo rectungulo = new Rectungulo(base,altura);
        rectungulo.calcularArea();
        rectungulo.calcularPerimetro();
    }
}