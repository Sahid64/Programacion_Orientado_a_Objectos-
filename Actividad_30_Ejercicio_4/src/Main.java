public class Main {
    public static void main(String[] args) {
        String marca = "MSI";
        double pantallaTamaño = 17.3;
        String tarjetaGrafica = "NVIDIA RTX 3080";

        // Validaciones
        if (marca.isEmpty()) {
            System.out.println("Error: La marca no puede estar vacía.");
            return;
        }

        if (pantallaTamaño <= 0) {
            System.out.println("Error: El tamaño de pantalla debe ser mayor que 0.");
            return;
        }

        if (tarjetaGrafica.isEmpty()) {
            System.out.println("Error: La tarjeta gráfica no puede estar vacía.");
            return;
        }

        // Crear objeto LaptopGaming si todo es válido
        LaptopGaming miLaptop = new LaptopGaming(marca, pantallaTamaño, tarjetaGrafica);

        // Mostrar información
        miLaptop.encender();            // De Computadora
        miLaptop.mostrarDetalles();     // De Laptop
        miLaptop.mostrarRendimiento();  // De LaptopGaming
    }
}
