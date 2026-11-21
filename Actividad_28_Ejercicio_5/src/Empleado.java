public class Empleado {
    public String nombre;
    public double sueldo;
    public Empleado(String nombre, double sueldo) {
        if (nombre.length() >= 3 && nombre.matches("[a-zA-Z ]+")) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido: solo letras y mínimo 3 caracteres.");
        }
        if (sueldo >= 7000 && sueldo < 100000) {
            this.sueldo = sueldo;
        } else {
            System.out.println("Sueldo inválido: debe ser entre 7000 y 100000.");
        }
    }
    public void mostrarInfo() {
        if (nombre != null && sueldo >= 7000) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo: $" + sueldo);
        }
    }
}
