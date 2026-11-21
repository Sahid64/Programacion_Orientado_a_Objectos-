import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean intento=true;
        String nombre="";
        int edad=1;
        Animal animal=new Animal("", 1);
        Gato gato = new Gato();
        Perro perro= new Perro();
        do {
            System.out.println("1.Perro, 2.Gato, 0.Salir");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    nombre=sc.nextLine();
                    System.out.println("Ingresa la edad: ");
                    edad=sc.nextInt();
                    animal.getNombre(nombre);
                    animal.getEdad(edad);
            }
        }while (intento);
    }
}