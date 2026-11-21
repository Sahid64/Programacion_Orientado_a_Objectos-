public class Mono extends Animal {
    public String tipo;

    public Mono(String nombre, int edad, String tipo) {
        super(nombre, edad);
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de mono no puede estar vacío.");
        }
        this.tipo = tipo;
    }

    public void trepar() {
        System.out.println("El mono trepa árboles");
    }
}
