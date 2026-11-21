import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean continuarPrograma = true;

        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();

            if (opcion == 0) {
                continuarPrograma = false;
                continue;
            }

            if (opcion < 1 || opcion > 2) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue;
            }

            Animal animal = crearAnimal(opcion, scanner);
            manejarAnimal(animal, scanner);

            System.out.print("\n¿Desea calcular otro animal? (1: Sí, 0: No): ");
            continuarPrograma = scanner.nextInt() == 1;

        } while (continuarPrograma);

        System.out.println("\nPrograma terminado. ¡Hasta luego!");
        scanner.close();
    }
    private static void mostrarMenuPrincipal() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static Animal crearAnimal(int tipo, Scanner scanner) {
        scanner.nextLine(); // Limpiar buffer

        System.out.print("\nIngrese el nombre del animal: ");
        String nombre = scanner.nextLine();

        int edad = validarEdad(scanner, "Ingrese la edad del animal: ");

        Animal animal = (tipo == 1) ? new Perro() : new Gato();
        animal.setNombre(nombre);
        animal.setEdad(edad);

        return animal;
    }

    private static int validarEdad(Scanner scanner, String mensaje) {
        int edad = 0;
        for (int intento = 1; intento <= 3; intento++) {
            System.out.print(mensaje);
            edad = scanner.nextInt();

            if (edad > 0) {
                return edad;
            }

            if (intento < 3) {
                System.out.println("Intento " + intento + ": Valor inválido. Intenta de nuevo.");
            } else {
                System.out.println("Intento 3 (último intento): Valor inválido. Se usará edad por defecto: 1.");
                return 1;
            }
        }
        return 1;
    }

    private static void manejarAnimal(Animal animal, Scanner scanner) {
        animal.mostrarDatos();
        int opcionAccion;
        boolean otraAccion;

        do {
            mostrarMenuAcciones();
            opcionAccion = scanner.nextInt();

            switch (opcionAccion) {
                case 1:
                    animal.mostrarDatos();
                    break;
                case 2:
                    modificarAnimal(animal, scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            if (opcionAccion != 0) {
                System.out.print("\n¿Desea realizar otra acción? (1: Sí, 0: No): ");
                otraAccion = scanner.nextInt() == 1;
            } else {
                otraAccion = false;
            }
        } while (opcionAccion != 0 && otraAccion);
    }

    private static void mostrarMenuAcciones() {
        System.out.println("\n=== MENÚ DE ACCIONES ===");
        System.out.println("1. Mostrar atributos");
        System.out.println("2. Modificar nombre y edad");
        System.out.println("0. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void modificarAnimal(Animal animal, Scanner scanner) {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("\nIngrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        animal.setNombre(nuevoNombre);

        int nuevaEdad = validarEdad(scanner, "Ingrese la nueva edad: ");
        animal.setEdad(nuevaEdad);

        System.out.println("\nDatos actualizados correctamente:");
        animal.mostrarDatos();
    }
}