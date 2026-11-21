import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la marca: ");
        String marca = sc.nextLine();
        System.out.println("Ingresa el modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Ingresa la veolocidad maxima: (km/h) ");
        double velocidadMaxima = sc.nextDouble();
        System.out.println("Ingresa el consumo de gasolina por litro: ");
        double gastoGasolinaPorLitro = sc.nextDouble();

        Coche miCoche = new Coche(marca, modelo, velocidadMaxima, gastoGasolinaPorLitro);
        System.out.println("Informacion del coche");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Maxima: " + miCoche.getVelocidadMaxima() + " km/h");
        System.out.println("Gasto por litro: " + miCoche.getGastoGasolinaPorLitro() + " litros/km");

        System.out.println("Quieres cambiar algun atributo del coche= (si/no)");
        sc.nextLine();
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("\n¿Que atributo te gustaria cambia?");
            System.out.println("1. Marca");
            System.out.println("2. Modelo");
            System.out.println("3. Velocidad maxima");
            System.out.println("4. Gasto de gasolina");
            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1) {
                System.out.println("Ingresa la nueva marca: ");
                miCoche.setMarca(sc.nextLine());
            } else if (opcion == 2) {
                System.out.println("Ingresa el nueva modelo: ");
                miCoche.setModelo(sc.nextLine());
            } else if (opcion == 3) {
                System.out.println("Ingresa la nueva velocidad maxima: ");
                miCoche.setVelocidadMaxima(sc.nextDouble());
            } else if (opcion == 4) {
                System.out.println("Ingresa el nuevo gasto de gasolina: ");
                miCoche.setGastoGasolinaPorLitro(sc.nextDouble());
            }
        }
        System.out.println("\nInformacion del coche Actualizada");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Maxima: " + miCoche.getVelocidadMaxima() + " km/h");
        System.out.println("Gasto por litro: " + miCoche.getGastoGasolinaPorLitro() + " litros/km");

        System.out.println("\nIngrese una distancia: (en Kilometros) ");
        double distancia = sc.nextDouble();
        double gasto = miCoche.calcularGastoGasolina(distancia);
        System.out.println("El gasto total de gasolin para " + distancia + " km es: " + gasto + " litros");
    }
}