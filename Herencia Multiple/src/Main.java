public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Pato con un nombre
        Pato pato = new Pato("Donald");

        // Llamar a los métodos de la clase Pato
        pato.comer();   // Método heredado de Animal
        pato.volar();   // Método de la clase Pato
        pato.nadar();   // Método de la clase Pato
    }
}
