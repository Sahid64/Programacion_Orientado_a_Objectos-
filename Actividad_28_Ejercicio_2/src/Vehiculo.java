public class Vehiculo {
    public String modelo;
    public Vehiculo(String modelo) {
        if (modelo.trim().isEmpty()) {
            System.out.println("El modelo no puede estar vacío.");
        } else {
            this.modelo = modelo;
        }
    }
    public void encender() {
        if (modelo != null) {
            System.out.println("El vehículo " + modelo + " está encendido.");
        }
    }
}