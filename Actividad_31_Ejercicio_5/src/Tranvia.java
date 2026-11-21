public class Tranvia extends Transporte {
    public double longitud;

    public Tranvia(String nombre, int capacidad, double longitud) {
        super(nombre, capacidad);
        this.longitud = longitud;
    }

    public void sonarCampana() {
        System.out.println("El tranvía suena la campana mientras recorre " + longitud + " km");
    }
}