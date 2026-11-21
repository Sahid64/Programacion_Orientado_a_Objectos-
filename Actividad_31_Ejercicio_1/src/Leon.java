public class Leon extends Animal {
    public boolean manada;

    public Leon(String nombre, int edad, boolean manada) {
        super(nombre, edad);
        this.manada = manada;
    }
    public void rugir() {
        System.out.println("¡Rooaaar!");
    }
}
