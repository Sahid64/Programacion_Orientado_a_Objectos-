public class Empleado extends Persona {
    public double sueldo;
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad); // Llama al constructor de Persona
        this.sueldo = sueldo;
    }
    public void mostrarSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }
}