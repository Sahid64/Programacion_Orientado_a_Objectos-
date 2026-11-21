public class Main {
    public static void main(String[] args) {
        String color = "Rojo";
        int cilindrada = 600;
        double velocidadMaxima = 320.5;

        if (color.isEmpty()) {
            System.out.println("Error: El color no puede estar vacío.");
            return;
        }

        if (cilindrada <= 0) {
            System.out.println("Error: La cilindrada debe ser mayor que 0.");
            return;
        }

        if (velocidadMaxima <= 0) {
            System.out.println("Error: La velocidad máxima debe ser mayor que 0.");
            return;
        }

        MotoDeCarrera moto = new MotoDeCarrera(color, cilindrada, velocidadMaxima);

        moto.detalles();
        moto.arrancar();
        moto.alcanzarVelocidad();
    }
}
