import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la calif de la materia 1: ");
        float cal1 = sc.nextFloat();
        if (cal1<1||cal1>10){
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        System.out.println("Ingresa la calif de la materia 2: ");
        float cal2 = sc.nextFloat();
        if (cal2<1||cal2>10){
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        System.out.println("Ingresa la calif de la materia 3: ");
        float cal3 = sc.nextFloat();
        if (cal3<1||cal3>10){
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        System.out.println("Ingresa la calif de la materia 4: ");
        float cal4 = sc.nextFloat();
        if (cal4<1||cal4>10){
            System.out.println("El numero ingresa no es del 1 al 10");
            return;
        }
        float cald = cal1 + cal2 + cal3 + cal4;
        float calf = cald/4;
        System.out.println("La calf es: " + calf);
        if (calf<6) {
            for (int i=0;i<5;i++){
                System.out.println("Me voy a poner a estudiar más");
            }
        }
        if (calf>=6 && calf<7) {
            System.out.println("Estudia más");
        }
        if (calf>=7 && calf<10) {
            System.out.println("Bien");
        }
        if (calf==10){
            System.out.println("Excelente");
        }


        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero inicial: ");
        int ini = sc.nextInt();

        System.out.print("Ingresa el numero final:");
        int fin = sc.nextInt();
        if (ini<fin) {
        for (int i= ini; i<=fin; i+=1){
            System.out.println(i);
            }
        } else if (ini==fin){
            System.out.println("Error, debes de ingresar uno menor y mayor");
            } else {
            System.out.println("Error, debes de ingresa eun numero mayor fin");
        }
        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello and welcome");
        for (int i = 10; i > 0; i-=2){
            System.out.println(i);
        }
        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        float nu1 = sc.nextFloat();
        System.out.print("Ingresa otro numero: ");
        float nu2 = sc.nextFloat();
                float suma = nu1 + nu2;
        if (suma > 0){
            System.out.println("El numero es positivo");
        } else if (suma < 0){
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
        */

        /*
        System.out.print("Ingresa un numero ");
    float nu1 = sc.nextFLoat();

    System.out.print("Ingresa otro numero");
    float nu2 = sc.nextFloat();

    float suma = nu1 + nu2;
    System.out.println("La suma es: " + suma);
    */


        /*
        Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa un numero: ");
    int numero = sc.nextInt();
    if (numero > 0){
        System.out.println("El numero es positivo");
    } else if (numero < 0){
        System.out.println("El numero es negativo.");
    } else {
        System.out.println("El numero es cero.");
    }
    sc.close();
    */

    /*
    int a = 10;
    int b = 4;
    System.out.println("Suma: " + (a+b));
    System.out.println("Resta: " + (a+b));
    System.out.println("Multiplicacion: " + a * b);
    System.out.println("Division: " + a / b);
    System.out.println("Modulo: " + a % b);
    */


        /*
        byte edadByte = 25;
    short añoShort = 2024;
    int poblacion = 150000;
    long distancia = 987654321L;
    //Decimales
    float precioGloat = 9.99f;
    double temperaturaDouble = 36.5;
    //Caracter
    char letra = 'J';
    //Booleano
    boolean esJavaDivertido = true;
    //Imprimir Valores
    System.out.println("Byte (Edad)" + edadByte);
    System.out.println("Short (Año)" + añoShort);
    System.out.println("Int (Poblacion)" + poblacion);
    System.out.println("Long (Distancia)" + distancia);
    System.out.println("Float (Precio)" + precioGloat);
    System.out.println("Double (Temperatura)" + temperaturaDouble);
    System.out.println("Char (Letra)" + letra);
    System.out.println("Boolean (Java es divertido)" + esJavaDivertido);



    Scanner sc = new Scanner(System.in);

        System.out.println("Calculo del Promedio de 5 Parciales.");
        System.out.print("Primera parcial: ");
        float p1 = sc.nextFloat();

        System.out.print("Segunda Parcial: ");
        float p2 = sc.nextFloat();

        System.out.print("Tercera Parcial: ");
        float p3 = sc.nextFloat();

        System.out.print("Cuarta Parcial: ");
        float p4 = sc.nextFloat();

        System.out.print("Quinta Parcial: ");
        float p5 = sc.nextFloat();

        float pr1 = (p1 + p2 + p3 + p4 + p5);
        float promedio = (pr1/5);
        System.out.println("Tu promedio es de: " + promedio);
        if (p1 == 0 || p2 == 0 || p3 == 0 || p4 == 0 || p5 == 0) {
            System.out.println("Necesitas Recursar le semestre");
        } else {
            if (promedio >= 6) {
                System.out.println("Aprobaste la Materia.");
            }
            if (promedio < 6) {
                System.out.println("No aprobaste la Materia.");
            }
        }


        
        //Leer un numero entero
        /*
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tu altura: ");
        float altura = sc.nextFloat();

        System.out.println("Tu edad es: " + edad + " y Tu altura es: " + altura + "m");
        //System.out.println("Tu edad es: %d y Tu altura es: %.2f m altura" , edad , altura);
        */

        /*int x = 5;
        System.out.println("Hola mundo");
        int numEntero = 4;
        System.out.println(numEntero);

        String nombre = "Sahid";
        String ap1 = "Barroso";
        String ap2 = "Alvarez";

        System.out.println(nombre + " " + ap1 + " " + ap2);







        /*
        String name = "Sahid ";
        String lastname1 = "Barroso ";
        String lastname2 = "Alvarez ";

        System.out.println("\n");
        System.out.println(name);
        System.out.println(lastname1);
        System.out.println(lastname2);

        System.out.println(x);
        System.out.printf("Hello and welcome!");
        System.out.println("Hola 20");
        System.out.println("Este es un ejemplo de println");
    */
    }
}
