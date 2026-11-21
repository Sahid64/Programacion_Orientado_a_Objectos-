public class LaptopGaming extends Laptop {
    public String tarjetaGrafica;

    public LaptopGaming(String marca, double pantallaTamaño, String tarjetaGrafica) {
        super(marca, pantallaTamaño);
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void mostrarRendimiento() {
        System.out.println("Rendimiento de la tarjeta gráfica: " + tarjetaGrafica);
    }
}