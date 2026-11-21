import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la calificación de la primera: ");
        float cal1 = sc.nextFloat();
        System.out.print("Ingresa la calificación de la segunda: ");
        float cal2 = sc.nextFloat();
        System.out.print("Ingresa la calificación de la tercera: ");
        float cal3 = sc.nextFloat();
        System.out.print("Ingresa la calificación de la cuarta: ");
        float cal4 = sc.nextFloat();
        System.out.print("Ingresa la calificación de la quinta: ");
        float cal5 = sc.nextFloat();
        float calif = cal1+cal2+cal3+cal4+cal5;
        float prome = calif/5;
        System.out.println("Tu calificación es "+prome);
        if (cal1==0|cal2==0|cal3==0|cal4==0|cal5==0){
            System.out.println("Necesitas recursar el semestre");
        } else if (prome>10) {
            System.out.println("Error, ingresaste un numero mayor a 10, intentalo otra vez");
        } else if (prome<6) {
            System.out.println("No aprobaste la materia");
        } else if (prome>=6) {
            System.out.println("Aprobaste la materia");

        }
    }
}