public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus("Autobús Urbano", 50, "Ruta 1");
        Metro metro = new Metro("Metro CDMX", 200, "3");
        Tranvia tranvia = new Tranvia("Tranvía Centro", 100, 12.5);
        Taxi taxi = new Taxi("Taxi Amarillo", 4, "ZXC-12345");
        BicicletaPublica bici = new BicicletaPublica("Bici CDMX", 1, 42);

        autobus.mostrarInfo();
        autobus.recogerPasajeros();
        System.out.println();

        metro.mostrarInfo();
        metro.abrirPuertas();
        System.out.println();

        tranvia.mostrarInfo();
        tranvia.sonarCampana();
        System.out.println();

        taxi.mostrarInfo();
        taxi.iniciarViaje();
        System.out.println();

        bici.mostrarInfo();
        bici.liberarBicicleta();
    }
}