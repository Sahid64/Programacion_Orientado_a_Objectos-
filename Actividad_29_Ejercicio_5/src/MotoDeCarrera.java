public class MotoDeCarrera extends Moto {
    public double velocidadMaxima;
    public MotoDeCarrera(String color, int cilindrada, double velocidadMaxima) {
        super(color, cilindrada); // Llama al constructor de Moto
        this.velocidadMaxima = velocidadMaxima;
    }
    public void alcanzarVelocidad() {
        System.out.println("La moto de carrera alcanza una velocidad máxima de " + velocidadMaxima + " km/h");
    }
}