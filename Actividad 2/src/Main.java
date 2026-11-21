import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: ");
        String Nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu altura: ");
        double altura = sc.nextFloat();

        System.out.print("Estado Civil: (S: Soltero, C: Casado, D: Divorciado):");
        char inicial = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("¿Eres mayor de edad? (Si o No) ");
        char med = sc.nextLine().charAt(0);


        System.out.println("Nombre: "+Nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("Estado civil: "+ inicial);
        System.out.println("¿Eres mayor de edad? "+ med);
        System.out.print("Yo "+Nombre+ " con la edad de "+edad+"Pasare con 10 la materia");

    }
}