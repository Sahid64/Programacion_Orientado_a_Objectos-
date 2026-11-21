import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la marca del carro: ");
        String marca = sc.nextLine();
        System.out.println("Ingresa el modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Ingresa el año del carro: ");
        int anio = sc.nextInt();
        System.out.println("Ingresa el kilometraje recorrido: ");
        double km = sc.nextDouble();

        Automovil tuAutomovil = new Automovil(marca,modelo,anio,km);
        tuAutomovil.coducir(km);
        tuAutomovil.informacion();
    }
}