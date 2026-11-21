public class Autobus extends Transporte {
    public String rutas;

    public Autobus(String nombre, int capacidad, String rutas) {
        super(nombre, capacidad);
        this.rutas = rutas;
    }
    public void recogerPasajeros() {
        System.out.println("El autobús recoge pasajeros en la ruta " + rutas);
    }
}