public class Mono extends Animal {
    public String tipo;

    public Mono(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }

    public void trepar() {
        System.out.println("El mono trepa árboles");
    }
}