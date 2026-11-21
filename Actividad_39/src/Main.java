import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n~~Menu de Figuras~~");
            System.out.println("1. Cubo");
            System.out.println("2. Esfera");
            System.out.println("3. Cilindro");
            System.out.println("0. Salir");
            System.out.println("Elige una figura:");
            opcion=sc.nextInt();

            if (opcion==0) break;

            Figura3D figura = null;
            boolean datosValidos=false;

            for (int i = 0;i<3&&!datosValidos;i++){
                switch (opcion){
                    case 1:
                        System.out.println("Ingresa el lado");
                        double lado = sc.nextDouble();
                        if (lado>0){
                            figura = new Cubo(lado);
                            datosValidos=true;
                        }else {
                            System.out.println("Datos invalido");
                        }
                        break;
                    case 2:
                        System.out.print("Ingresa el radio: ");
                        double radio = sc.nextDouble();
                        if (radio > 0) {
                            figura = new Esfera(radio);
                            datosValidos = true;
                        } else {
                            System.out.println("Dato inválido.");
                        }
                        break;

                    case 3:
                        System.out.print("Ingresa el radio: ");
                        double r = sc.nextDouble();
                        System.out.print("Ingresa la altura: ");
                        double h = sc.nextDouble();
                        if (r > 0 && h > 0) {
                            figura = new Cilindro(r, h);
                            datosValidos = true;
                        } else {
                            System.out.println("Datos inválidos.");
                        }
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        i = 3;
                        break;
                }
            }
            if (figura != null) {
                figura.mostrarNombre();
                System.out.printf("Volumen: %.2f\n", figura.calcularVolumen());

                System.out.println("¿Qué deseas hacer con la figura?");
                System.out.println("1. Ver nombre actual");
                System.out.println("2. Cambiar nombre");
                System.out.print("Elige opción: ");
                int subopcion = sc.nextInt();
                sc.nextLine();

                if (subopcion == 1) {
                    System.out.println("Nombre: " + figura.getNombre());
                } else if (subopcion == 2) {
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    figura.setNombre(nuevoNombre);
                    System.out.println("Nombre actualizado a: " + figura.getNombre());
                }
            }

        } while (true);
        System.out.println("Programa finalizado.");
    }
}