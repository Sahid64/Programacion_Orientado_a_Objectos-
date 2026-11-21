import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroVehicular registro = new RegistroVehicular();
        boolean continuar = true;
        while (continuar){
            System.out.println("Menu");
            System.out.println("1. Agregar nuevo vehiculo");
            System.out.println("2. Buscar vehiculo por placa");
            System.out.println("3. Mostrar todos los vehiculos registrados");
            System.out.println("4. Salir");
            System.out.println("Seleciona una opcion: ");
            int opcion = sc.nextInt();

            if (opcion==1){
                System.out.println("Ingresa marca:");
                String marca = sc.next();
                System.out.println("Ingresa el modelo:");
                String modelo = sc.next();
                System.out.println("Ingresa el año:");
                int anio = sc.nextInt();
                System.out.println("Ingresa las placas:");
                String placa = sc.next();

                Vehiculo nuevoVehiculo = new Vehiculo(marca,modelo,anio,placa);
                registro.agregarVehiculo(nuevoVehiculo);
            } else if (opcion==2) {
                System.out.println("Ingresa la placa:");
                String placa = sc.next();
                Vehiculo vehiculo = registro.buscadorVehiculoPorPlaca(placa);
                if (vehiculo != null) {
                    vehiculo.mostrarDetalles();
                } else {
                    System.out.println("Vehiculo no encontrado");
                }
            } else if (opcion==3) {
                registro.mostrarTodosVehiculos();
            } else if (opcion==4) {
                System.out.println("Saliendo del sistema....");
                continuar= false;
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
}