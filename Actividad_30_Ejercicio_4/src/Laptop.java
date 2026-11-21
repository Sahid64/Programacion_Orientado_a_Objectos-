public class Laptop extends Computadora {
    public double pantallaTamaño;

    public Laptop(String marca, double pantallaTamaño) {
        super(marca);
        this.pantallaTamaño = pantallaTamaño;
    }

    public void mostrarDetalles() {
        System.out.println("Tamaño de pantalla: " + pantallaTamaño + " pulgadas");
    }
}