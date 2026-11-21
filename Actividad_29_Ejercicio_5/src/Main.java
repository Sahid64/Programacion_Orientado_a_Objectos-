public class Main {
    public static void main(String[] args) {
        MotoDeCarrera miMoto = new MotoDeCarrera("Rojo", 600, 280.5);
        miMoto.detalles();
        miMoto.arrancar();
        miMoto.alcanzarVelocidad();
    }
}