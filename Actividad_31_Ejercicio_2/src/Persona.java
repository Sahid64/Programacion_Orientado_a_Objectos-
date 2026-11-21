public class Persona {
    public String nombre;
    public int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}