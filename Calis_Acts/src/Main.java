public class Main {
    public static void main(String[] args) {
        HidroAvion avion1 = new HidroAvion("HidroJet 3000");
        avion1.moverse();
        avion1.volar();
        avion1.navegar();

        System.out.println("\n--- Prueba con nombre inválido ---");
        HidroAvion avion2 = new HidroAvion("");
        avion2.moverse();
        avion2.volar();
        avion2.navegar();
    }
}
