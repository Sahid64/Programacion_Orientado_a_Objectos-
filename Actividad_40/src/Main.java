import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el volumen de la Guitarra:");
        int volumen1 = sc.nextInt();
        System.out.println("Ingresa el costo de Mantenimiento");
        double costoMantenimientoBasa1 = sc.nextDouble();

        System.out.println("Ingresa el volumen del Piano:");
        int volumen2 = sc.nextInt();
        System.out.println("Ingresa el costo de Mantenimiento");
        double costoMantenimientoBasa2 = sc.nextDouble();

        System.out.println("Ingresa el volumen de la Batería:");
        int volumen3 = sc.nextInt();
        System.out.println("Ingresa el costo de Mantenimiento");
        double costoMantenimientoBasa3 = sc.nextDouble();

        Instrumento guitarra = new Guitarra("Guitarra", volumen1, costoMantenimientoBasa1);
        Instrumento piano = new Piano("Piano", volumen2, costoMantenimientoBasa2);
        Instrumento bateria = new Bateria("Batería", volumen3, costoMantenimientoBasa3);


        System.out.println("\n--- Guitarra ---");
        guitarra.tocar();
        System.out.println("Volumen: " + guitarra.getVolumen());
        System.out.println("Costo mantenimiento: $" + guitarra.calcularCostoMantenimiento());

        System.out.println("\n--- Piano ---");
        piano.tocar();
        System.out.println("Volumen: " + piano.getVolumen());
        System.out.println("Costo mantenimiento: $" + piano.calcularCostoMantenimiento());

        System.out.println("\n--- Batería ---");
        bateria.tocar();
        System.out.println("Volumen: " + bateria.getVolumen());
        System.out.println("Costo mantenimiento: $" + bateria.calcularCostoMantenimiento());

    }
}