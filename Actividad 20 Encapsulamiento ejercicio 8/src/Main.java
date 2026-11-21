import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre = sc.next();
        System.out.println("Ingresa la especie: ");
        String especie = sc.next();
        System.out.println("Ingresa la edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresa el peso: ");
        double peso = sc.nextDouble();
        Mascota mascota = new Mascota(nombre,especie,edad,peso);

        for (;;){
            System.out.println("~~Menu~~");
            System.out.println("1. Crear nueva mascota");
            System.out.println("2. Ver los detalles");
            System.out.println("3. Cambiar nombre, especie, edad o peso");
            System.out.println("4. Clasificar peso");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            int num = sc.nextInt();
            if (num==1){
                System.out.println("Ingresa el nombre: ");
                mascota.setNombre(sc.next());
                System.out.println("Ingresa la especie: ");
                mascota.setEspecie(sc.next());
                System.out.println("Ingresa la edad: ");
                mascota.setEdad(sc.nextInt());
                System.out.println("Ingresa el peso: ");
                mascota.setPeso(sc.nextDouble());
            } else if (num==2) {
                mascota.mostrarDetalles();
            } else if (num==3) {
                System.out.println("1. Nombre");
                System.out.println("2. Especie");
                System.out.println("3. Edad");
                System.out.println("4. Peso");
                System.out.println("Elige:");
                int op =sc.nextInt();
                if (op==1){
                    System.out.println("Ingresa le nombre:");
                    mascota.setNombre(sc.next());
                } else if (op==2) {
                    System.out.println("Ingresa la especie: ");
                    mascota.setEspecie(sc.next());
                } else if (op==3) {
                    System.out.println("Ingresa la edad: ");
                    mascota.setEdad(sc.nextInt());
                } else if (op==4) {
                    System.out.println("Ingresa el peso: ");
                    mascota.setPeso(sc.nextDouble());
                }else System.out.println("Opcion invalida; ");
            } else if (num==4) {
                mascota.clasificarPeso(peso);
            } else if (num==5) {
                break;
            }else System.out.println("Opcion invalida");
        }
    }
}