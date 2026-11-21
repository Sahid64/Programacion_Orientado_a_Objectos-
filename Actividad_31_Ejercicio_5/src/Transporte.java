public class Transporte {
    public String nombre;
    public int capacidad;

    public Transporte(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre del transporte: " + nombre);
        System.out.println("Capacidad: " + capacidad + " personas");
    }
}