class Pato extends Animal {

    // Constructor de la clase Pato que llama al constructor de Animal
    public Pato(String nombre) {
        super(nombre);
    }

    // Método para volar
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    // Método para nadar
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}