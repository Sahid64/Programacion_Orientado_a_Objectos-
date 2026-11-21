import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu matricula: ");
        String matricula = sc.nextLine();
        System.out.print("Ingresa tu calificacion de la primera parcial: ");
        double cali1 = sc.nextDouble();
        System.out.print("Ingresa tu calificacion de la segunda parcial: ");
        double cali2 = sc.nextDouble();
        if (cali1 < 0 || cali1 > 10 || cali2 < 0 || cali2 > 10) {
            System.out.println("Error, los valores ingresados no son correctos");
            return;
        }
        Estudiante yoEstudiante = new Estudiante(nombre, matricula, (cali1 + cali2) / 2);
        yoEstudiante.calcularPromedio(cali1, cali2);
        yoEstudiante.mostrarDatos(cali1, cali2);
    }
}