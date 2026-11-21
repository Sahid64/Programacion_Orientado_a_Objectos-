public class Vehiculo {
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public void moverse() {
        if (nombre != null && !nombre.trim().isEmpty()) {
            System.out.println(nombre + " se está moviendo.");
        } else {
            System.out.println("Error: nombre del vehículo inválido para moverse.");
        }
    }
}
