public class Main {
    public static void main(String[] args) {
        String nombre = "Max";
        int edad = 3;
        String raza = "Labrador";
        if (nombre.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }
        if (edad <= 0) {
            System.out.println("Error: La edad debe ser mayor que 0.");
            return;
        }
        if (raza.isEmpty()) {
            System.out.println("Error: La raza no puede estar vacía.");
            return;
        }
        Perro miPerro = new Perro(nombre, edad, raza);
        miPerro.hacerSonido();
        miPerro.alimentarse();
        miPerro.ladrar();
    }
}
