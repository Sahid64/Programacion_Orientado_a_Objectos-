import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpleadoInstru empleadoInstru = new EmpleadoInstru("",0,0);
        DepartamentoInstru departamentoInstru = new DepartamentoInstru("",0);

        for(;;){
            System.out.println("\nMenu:");
            System.out.println("1. Ingresar datos de Empleado");
            System.out.println("2. Ingresar datos de Departamento");
            System.out.println("3. Cambiar datos de Empleado");
            System.out.println("4. Cambiar datos de Departamento");

            System.out.println("Presiona cualquier tecla para salir ");
            System.out.println("Ingresa alguna opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion==1){
                System.out.println("Ingresa el nombre del empleado: ");
                String nombreEm = sc.nextLine();
                System.out.println("Ingresa la edad del empleado: ");
                int edad = sc.nextInt();
                System.out.println("Ingresa el salario del empleado: ");
                double salario = sc.nextDouble();
                empleadoInstru = new EmpleadoInstru(nombreEm,edad,salario);
                System.out.println("\nEmpleado Creado:");
                empleadoInstru.mostrarDetalles();
                sc.nextLine();

            }
            if (opcion==2){
                System.out.println("Ingresa el nombre del departamento: ");
                String nombreDep = sc.nextLine();
                System.out.println("Ingresa la cantidad de empleados: ");
                int numEmpleados = sc.nextInt();
                departamentoInstru = new DepartamentoInstru(nombreDep,numEmpleados);
                System.out.println("\nDepartamento creado: ");
                departamentoInstru.mostrarInformacion();
                sc.nextLine();
            }
            if (opcion==3){
                System.out.println("\n¿Que deseas cambiar?");
                System.out.println("1. Nombre");
                System.out.println("2. Edad");
                System.out.println("3. Salario");
                int num = sc.nextInt();
                if (num==1){
                    System.out.println("Ingresa el nuevo nombre: ");
                    empleadoInstru.setNombreEm(sc.nextLine());
                } else if (num==2){
                    System.out.println("Ingresa la nueva edad: ");
                    empleadoInstru.setEdad(sc.nextInt());
                } else if (num==3){
                    System.out.println("Ingresa el nuevo salario: ");
                    empleadoInstru.setSalario(sc.nextDouble());
                }
                sc.nextLine();
                System.out.println("\nEmpleado actualizado");
                empleadoInstru.mostrarDetalles();
            }
            if (opcion==4){
                System.out.println("\n¿Que deseas cambiar?");
                System.out.println("1. Nombre");
                System.out.println("2. Numero de empleados");
                int num = sc.nextInt();
                if (num==1){
                    System.out.println("Ingresa el nuevo nombre:");
                    departamentoInstru.setNombre(sc.nextLine());
                } else if (num==2){
                    System.out.println("Ingresa el nuevo numero de empleados:");
                    departamentoInstru.setNumEmpleados(sc.nextInt());
                }
                sc.nextLine();
                System.out.println("\nDepartamento actualizado");
                departamentoInstru.mostrarInformacion();
            }

        }
    }
}