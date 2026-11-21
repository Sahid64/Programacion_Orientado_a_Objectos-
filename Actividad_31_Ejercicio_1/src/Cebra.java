public class Cebra extends Animal {
    public int rayas;

    public Cebra(String nombre, int edad, int rayas) {
        super(nombre, edad);
        this.rayas = rayas;
    }

    public void correr() {
        System.out.println("La cebra corre rápidamente");
    }
}