import java.util.Scanner;

//Barroso Alvarez Daniel Sahid
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double promedio;
        System.out.println("Ingresa tu nombre del Alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu matricula: ");
        String matricula = sc.nextLine();
        System.out.println("Ingresa la calificacion Parcial 1: ");
        double calificacionParcial1 = sc.nextDouble();
        System.out.println("Ingresa la calificacion Parcial 2: ");
        double calificacionParcial2 = sc.nextDouble();
        System.out.println("Ingresa la calificacion Parcial 3: ");
        double calificacionParcial3 = sc.nextDouble();
        if (calificacionParcial1 > 0 && calificacionParcial1 < 10.1 && calificacionParcial2 > 0 && calificacionParcial2 < 10.1 && calificacionParcial3 > 0 && calificacionParcial3 < 10.1) {

            Clase clase = new Clase(nombre, matricula, calificacionParcial1, calificacionParcial2, calificacionParcial3);

            System.out.println("---INFORMACION DEL ALUMNO---");
            clase.mostrarInformacion();
            clase.calcularPromedioFinal();
            clase.mostrarEvaluacion();

            System.out.println("¿Deseas modificar algun dato?(s/n)");
            //Error aqui por no escanear
                System.out.println("1. Nombre");
                System.out.println("2. Matricula");
                System.out.println("3. Calificacion Parcial 1");
                System.out.println("4. Calificacion Parcial 2");
                System.out.println("5. Calificacion Parcial 3");
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.println("Nuevo nombre: ");
                    clase.setNombre(sc.nextLine());
                }
                if (num == 2) {
                    System.out.println("Nueva Calificacion Parcial 1");
                    clase.setMatricula(sc.nextLine());
                }
                if (num == 3) {
                    System.out.println("Nueva Calificacion Parcial 1");
                    clase.setCalificacion1(sc.nextDouble());
                }
                if (num == 4) {
                    System.out.println("Nueva Calificacion Parcial 2");
                    clase.setCalificacion2(sc.nextDouble());
                }
                if (num == 5) {
                    System.out.println("Nueva Calificacion Parcial 3");
                    clase.setCalificacion3(sc.nextDouble());
                }
                System.out.println("---INFORMACION DEL ALUMNO---");
                clase.mostrarInformacion();
                clase.calcularPromedioFinal();
                clase.mostrarEvaluacion();
        } else {
                System.out.println("Numero negativo ingresado");
            }
        }
        //Eror a la hora de imprimir la calif parcial 1 y el promedio
    //Pero si da bien el resultado y lo demás
}

