import java.util.Scanner;

class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método clasificarSalario
    public String clasificarSalario() {
        if (salario > 50000) {
            return "Alta";
        } else if (salario >= 10000) {
            return "Media";
        } else {
            return "Baja";
        }
    }

    // Método mostrarDetalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Clasificación salarial: " + clasificarSalario());
    }
}

class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private Empleado[] empleados;

    // Constructor
    public Departamento(String nombre, int numeroEmpleados) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.empleados = new Empleado[numeroEmpleados];
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    // Método clasificarNumeroEmpleados
    public String clasificarNumeroEmpleados() {
        int numDigitos = String.valueOf(numeroEmpleados).length();
        if (numDigitos == 1) {
            return "1 dígito";
        } else if (numDigitos == 2) {
            return "2 dígitos";
        } else if (numDigitos == 3) {
            return "3 dígitos";
        } else {
            return "Más de 3 dígitos";
        }
    }

    // Método mostrarInformacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de empleados: " + numeroEmpleados);
        System.out.println("Clasificación de empleados en el departamento: " + clasificarNumeroEmpleados());
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                empleado.mostrarDetalles();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = null;
        Departamento departamento = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar datos de Empleado");
            System.out.println("2. Ingresar datos de Departamento");
            System.out.println("3. Cambiar atributos de Empleado");
            System.out.println("4. Cambiar atributos de Departamento");
            System.out.println("Presiona cualquier otra tecla para salir");

            System.out.print("Por favor, ingresa una opción: ");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                // Ingresar datos de empleado
                System.out.print("Por favor, ingresa el nombre del empleado: ");
                String nombreEmpleado = scanner.nextLine();

                System.out.print("Por favor, ingresa la edad del empleado: ");
                int edadEmpleado = Integer.parseInt(scanner.nextLine());

                System.out.print("Por favor, ingresa el salario del empleado: ");
                double salarioEmpleado = Double.parseDouble(scanner.nextLine());

                if (!nombreEmpleado.isEmpty() && edadEmpleado > 0 && salarioEmpleado > 0) {
                    empleado = new Empleado(nombreEmpleado, edadEmpleado, salarioEmpleado);
                    System.out.println("\nEmpleado creado:");
                    empleado.mostrarDetalles();
                } else {
                    System.out.println("Entrada inválida. Intenta de nuevo.");
                }
            } else if (opcion.equals("2")) {
                // Ingresar datos de departamento
                System.out.print("Por favor, ingresa el nombre del departamento: ");
                String nombreDepartamento = scanner.nextLine();

                System.out.print("Por favor, ingresa el número de empleados del departamento: ");
                int numeroEmpleados = Integer.parseInt(scanner.nextLine());

                if (!nombreDepartamento.isEmpty() && numeroEmpleados > 0) {
                    departamento = new Departamento(nombreDepartamento, numeroEmpleados);
                    System.out.println("\nDepartamento creado:");
                    departamento.mostrarInformacion();
                } else {
                    System.out.println("Entrada inválida. Intenta de nuevo.");
                }
            } else if (opcion.equals("3")) {
                // Cambiar atributos de empleado
                if (empleado != null) {
                    System.out.println("\n¿Qué atributo deseas cambiar?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Edad");
                    System.out.println("3. Salario");

                    String opcionEmpleado = scanner.nextLine();

                    if (opcionEmpleado.equals("1")) {
                        System.out.print("Ingresa el nuevo nombre: ");
                        empleado.setNombre(scanner.nextLine());
                    } else if (opcionEmpleado.equals("2")) {
                        System.out.print("Ingresa la nueva edad: ");
                        empleado.setEdad(Integer.parseInt(scanner.nextLine()));
                    } else if (opcionEmpleado.equals("3")) {
                        System.out.print("Ingresa el nuevo salario: ");
                        empleado.setSalario(Double.parseDouble(scanner.nextLine()));
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    System.out.println("\nEmpleado actualizado:");
                    empleado.mostrarDetalles();
                } else {
                    System.out.println("Primero debes ingresar un empleado.");
                }
            } else if (opcion.equals("4")) {
                // Cambiar atributos de departamento
                if (departamento != null) {
                    System.out.println("\n¿Qué atributo deseas cambiar?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Número de empleados");

                    String opcionDepartamento = scanner.nextLine();

                    if (opcionDepartamento.equals("1")) {
                        System.out.print("Ingresa el nuevo nombre: ");
                        departamento.setNombre(scanner.nextLine());
                    } else if (opcionDepartamento.equals("2")) {
                        System.out.print("Ingresa el nuevo número de empleados: ");
                        departamento.setNumeroEmpleados(Integer.parseInt(scanner.nextLine()));
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    System.out.println("\nDepartamento actualizado:");
                    departamento.mostrarInformacion();
                } else {
                    System.out.println("Primero debes ingresar un departamento.");
                }
            } else {
                salir = true;
            }
        }
        scanner.close();
    }
}




/*
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto de la clase Gato con el nombre "Juancho",
        // peso 4.5 kg y tamaño 30.0 cm.
        Gato miGato = new Gato("Juancho", 4.5, 30.0);
        // Se utilizan los métodos getter para obtener los valores y
        // los setter para modificar los atributos si es necesario
        System.out.println("Nombre del gato: " + miGato.getNombre());
        miGato.setNombre("Juancho el Grande"); // Modificamos el nombre
        System.out.println("Nuevo nombre del gato: " + miGato.getNombre());
        miGato.hacerSonido();
        miGato.darComer();
        miGato.ronronear();
        System.out.println("---------------------------"); // Separador visual

        // Se crea un objeto de la clase Perro con el nombre "Rex",
        // peso 10.0 kg y tamaño 50.0 cm.
        Perro miPerro = new Perro("Rex", 10.0, 50.0);

        // Usamos los getters y setters de la clase Perro
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        //miPerro.setNombre("Rexito"); // Modificamos el nombre
        miPerro.nombre="Rax";
        System.out.println("Nuevo nombre del perro: " + miPerro.getNombre());

        miPerro.hacerSonido();
        miPerro.darComer();
        miPerro.moverCola();
    }
}








import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.println("Ingresa la altura: ");
        double altura = sc.nextDouble();
        if (base<0||altura<0){
            System.out.println("Error, numero negativo ingresado");
            return;
        }
        Rectangulo rectangulo = new Rectangulo(base,altura);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }
}
 */