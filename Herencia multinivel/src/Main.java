public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.comer();   // Método heredado de Animal
        perro.respirar(); // Método heredado de Mamifero
        perro.ladrar();   // Método de la clase Perro
    }
}