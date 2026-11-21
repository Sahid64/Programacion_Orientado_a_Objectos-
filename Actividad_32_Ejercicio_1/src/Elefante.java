public class Elefante extends Animal {
    public double peso;

    public Elefante(String nombre, int edad, double peso) {
        super(nombre, edad);
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0.");
        }
        this.peso = peso;
    }

    public void usarTrompa() {
        System.out.println("El elefante usa su trompa");
    }
}