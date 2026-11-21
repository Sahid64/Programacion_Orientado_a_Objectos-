public class Empleado extends Persona {
    public double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public void mostrarSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }
}