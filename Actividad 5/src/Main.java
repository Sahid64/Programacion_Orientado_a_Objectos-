import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabla de multiplicar");
        System.out.print("Ingresa el valor de la tabla: ");
        int tab = sc.nextInt();
        System.out.print("Ingresa el valor inicial: ");
        int vali = sc.nextInt();
        System.out.print("Ingresa el valor final:");
        int valf = sc.nextInt();
        if (tab<0||vali<0||valf<0){
            System.out.println("Error, el numero ingresado es menor a 0");

        } else {
            System.out.println("Tabla de multiplicar de: " + tab);
            for (int i = vali; i <= valf; i++) {
                int n = tab * i;
                System.out.println(tab + " x " + i + " = " + n);
            }
        }

    }
}