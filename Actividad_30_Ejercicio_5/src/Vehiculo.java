public class Vehiculo {
    public String color;

    public Vehiculo(String color) {
        this.color = color;
    }

    public void detalles() {
        System.out.println("Este es un vehículo de color " + color);
    }
}