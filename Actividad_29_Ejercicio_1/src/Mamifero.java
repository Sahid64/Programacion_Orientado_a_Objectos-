public class Mamifero extends Animal {
    public int edad;
    public Mamifero(String nombre, int edad) {
        super(nombre);  // Llama al constructor de Animal
        this.edad = edad;
    }
    public void alimentarse() {
        System.out.println("El mamífero se alimenta.");
    }
}