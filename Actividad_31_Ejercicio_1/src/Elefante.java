public class Elefante extends Animal {
    public double peso;

    public Elefante(String nombre, int edad, double peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    // Método usarTrompa()
    public void usarTrompa() {
        System.out.println("El elefante usa su trompa");
    }
}
