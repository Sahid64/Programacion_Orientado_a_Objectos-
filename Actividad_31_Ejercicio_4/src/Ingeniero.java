public class Ingeniero extends Empleado {
    String especialidad;

    public Ingeniero(String nombre, double salario, String especialidad) {
        super(nombre, salario);
        this.especialidad = especialidad;
    }

    public void programar() {
        System.out.println("El ingeniero programa en " + especialidad);
    }
}