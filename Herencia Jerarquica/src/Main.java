public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

        perro.comer();  // Método heredado de Animal
        perro.ladrar(); // Método de la clase Perro

        gato.comer();   // Método heredado de Animal
        gato.maullar(); // Método de la clase Gato
    }
}