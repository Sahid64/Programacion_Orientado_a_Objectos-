public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.respirar(); // Heredado de SerVivo
        miPerro.moverse();  // Heredado de Animal
        miPerro.ladrar();   // De la clase Perro
    }
}
