import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la calif de la materia 1: ");
        float cal1 = sc.nextFloat();
        if (cal1 < 1 || cal1 > 10) {
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        System.out.println("Ingresa la calif de la materia 2: ");
        float cal2 = sc.nextFloat();
        if (cal2 < 1 || cal2 > 10) {
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        System.out.println("Ingresa la calif de la materia 3: ");
        float cal3 = sc.nextFloat();
        if (cal3 < 1 || cal3 > 10) {
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        System.out.println("Ingresa la calif de la materia 4: ");
        float cal4 = sc.nextFloat();
        if (cal4 < 1 || cal4 > 10) {
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        float cald = cal1 + cal2 + cal3 + cal4;
        float calf = cald / 4;
        System.out.println("La calf es: " + calf);
        if (calf < 6) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Me voy a poner a estudiar más");
            }
        }
        if (calf >= 6 && calf < 7) {
            System.out.println("Estudia más");
        }
        if (calf >= 7 && calf < 10) {
            System.out.println("Bien");
        }
        if (calf == 10) {
            System.out.println("Excelente");
        }
    }
}