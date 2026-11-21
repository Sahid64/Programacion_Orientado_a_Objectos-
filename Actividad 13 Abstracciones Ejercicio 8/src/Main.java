import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de horas: ");
        int horas = sc.nextInt();
        System.out.print("Ingresa la cantidad de minutos del 0 al 60: ");
        int minutos = sc.nextInt();
        System.out.print("Ingresa la cantidad de segundos del 0 al 60: ");
        int segundos = sc.nextInt();
        if (horas<0||minutos<0||segundos<0){
            System.out.println("Error, números negativos ingresados");
        }
        Tiempo tuTiempo = new Tiempo(horas,minutos,segundos);
        tuTiempo.mostrarTiempo();
        System.out.println("<<<Suma al tiempo actual>>>");
        System.out.print("Ingresa las horas:");
        int h = sc.nextInt();
        System.out.print("Ingresa las minutos:");
        int m = sc.nextInt();
        System.out.print("Ingresa las segundos:");
        int s = sc.nextInt();
        tuTiempo.sumarTiempo(h,m,s);
    }
}