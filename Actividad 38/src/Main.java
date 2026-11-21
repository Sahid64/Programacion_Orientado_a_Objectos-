import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repetir = 1;
        do {
            System.out.println("\n~~Menu de FIguras~~");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("0. Salir");
            System.out.println("Elige una figura: ");
            int opcion = sc.nextInt();
            if (opcion == 0) {
                break;
            }
            if (opcion == 1 || opcion == 3) {
                System.out.println("Opcion invalida. Intente de nuevo");
                continue;
            }
            Figura figura = null;
            boolean datosValidos = false;

            for (int i = 0; i < 3 && !datosValidos; i++) {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa lado:");
                        double lado = sc.nextDouble();
                        if (lado > 0) {
                            figura = new Cuadrado(lado);
                            datosValidos = true;
                        } else {
                            System.out.println("Dato invalido. Intenta de nuevo");
                        }
                        break;
                    case 2:
                        System.out.println("Ingresa base:");
                        double base = sc.nextDouble();
                        System.out.println("Ingresa altura:");
                        double altura = sc.nextDouble();
                        if (altura > 0 || base > 0) {
                            figura = new Triangulo(base, altura);
                            datosValidos = true;
                        } else {
                            System.out.println("Dato invalido. Intenta de nuevo");
                        }
                        break;
                    case 3:
                        System.out.println("Ingresa radio:");
                        double radio = sc.nextDouble();
                        if (radio > 0) {
                            figura = new Circulo(radio);
                            datosValidos = true;
                        } else {
                            System.out.println("Dato invalido. Intenta de nuevo");
                        }
                        break;
                }
            }
            if (datosValidos&&figura!=null){
                figura.mostrarNombre();
                System.out.print("Area: %.2\n"+figura.calcularArea());
            }else {
                System.out.println("Demasiados intentos no validos.");
            }
            System.out.println("\n¿Desea calcular otra figura?(1:Si, 0:No)");
            repetir = sc.nextInt();
        }
        while (repetir==1);
        System.out.println("Programa finalizado");
    }
}