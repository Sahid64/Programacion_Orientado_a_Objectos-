import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu matricula:");
        String matricula = sc.nextLine();
        System.out.println("Ingresa la calificación Parcial 1:");
        double cali1 = sc.nextDouble();
        System.out.println("Ingresa la calificación Parcial 2:");
        double cali2 = sc.nextDouble();
        System.out.println("Ingresa la calificación Parcial 3:");
        double cali3 = sc.nextDouble();

        if (cali1>=0&&cali1<=10&&cali2>=0&&cali2<=10&&cali3>=0&&cali3<=10){
            sc.nextLine();
            Clase clase=new Clase(nombre,matricula,cali1,cali2,cali3);
            System.out.println("----Informacion del alumno-----");
            clase.mostrarinformacion();
            clase.calcularPromedioFinal();
            clase.mostrarEvaluacion();

            System.out.println("¿Deseas cambiar algún dato?(si/no)");
            String opcion=sc.nextLine();

            if (opcion.equalsIgnoreCase("si")){

                System.out.println("1. Nombre");
                System.out.println("2. Matricula");
                System.out.println("3. Calificación Parcial 1");
                System.out.println("4. Calificación Parcial 2");
                System.out.println("5. Calificación Parcial 3");

                int num = sc.nextInt();
                sc.nextLine();
                switch (num) {
                    case 1:
                        System.out.println("Nuevo nombre:");
                        clase.setNombre(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Nueva Matricula:");
                        clase.setMatricula(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Nueva Calificación Parcial 1:");
                        clase.setCali1(sc.nextDouble());
                        break;
                    case 4:
                        System.out.println("Nueva Calificación Parcial 2:");
                        clase.setCali2(sc.nextDouble());

                        break;
                    case 5:
                        System.out.println("Nueva Calificación Parcial 3:");
                        clase.setCali3(sc.nextDouble());

                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                System.out.println("----Informacion del alumno-----");
                clase.mostrarinformacion();
                clase.calcularPromedioFinal();
                clase.mostrarEvaluacion();
            }
        } else {
            System.out.println("Error: Alguna calificacion es invalida. Deben estar entre 0 y 10");
        }
    }
}