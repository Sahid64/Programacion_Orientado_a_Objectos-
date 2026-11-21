public class Moto extends Vehiculo {
    public int cilindrada;

    public Moto(String color, int cilindrada) {
        super(color);
        this.cilindrada = cilindrada;
    }

    public void arrancar() {
        System.out.println("La moto está arrancando.");
    }
}