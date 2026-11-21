import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de horas del 0 al 24: ");
        double horas = sc.nextDouble();
        if (horas<0){
            System.out.println("Error, numero negativo");
            return;
        }
        System.out.print("Ingresa los minutos del 0 al 60:  ");
        double minutos = sc.nextDouble();
        System.out.print("Ingresa los segundos del 0 al 60: ");
        double segundos = sc.nextDouble();
        Humano tuHumano = new Humano((int) horas, (int) minutos, (int) segundos);
        tuHumano.mostrarTiempo();
        tuHumano.sumarTiempo();
    }
}

/*
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto de la clase Gato con el nombre "Juancho"
        // Instancia
        Perro miPerro = new Perro("Juancho", 4.5F, 30.1F);
        Perro tuPerro = new Perro("Pedro", 50F, 20.3F);
        // Se llama al métodos
        miPerro.hacerSonido();
        miPerro.darComer();
        miPerro.ladrar();
        tuPerro.hacerSonido();
    }
}*/

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto de la clase Gato con el nombre "Juancho"
        // Instancia
        Scanner sc = new Scanner(System.in);
        Gato miGato = new Gato("Juancho", 4.5F, 30.1F);
        Gato tuGato = new Gato("Pedro", 50F, 20.3F);
        // Se llama al métodos
        miGato.hacerSonido();
        miGato.darComer();
        miGato.ronronear();
        tuGato.hacerSonido();
    }
}*/