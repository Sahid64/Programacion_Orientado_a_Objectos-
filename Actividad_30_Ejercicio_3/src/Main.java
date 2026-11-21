public class Main {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 35;
        double sueldo = 85000.0;
        String departamento = "Recursos Humanos";

        if (nombre.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }

        if (edad <= 0) {
            System.out.println("Error: La edad debe ser mayor que 0.");
            return;
        }

        if (sueldo <= 0) {
            System.out.println("Error: El sueldo debe ser mayor que 0.");
            return;
        }

        if (departamento.isEmpty()) {
            System.out.println("Error: El departamento no puede estar vacío.");
            return;
        }

        Gerente gerente1 = new Gerente(nombre, edad, sueldo, departamento);

        gerente1.mostrarDatos();
        gerente1.mostrarSueldo();
        gerente1.mostrarDepartamento();
    }
}
