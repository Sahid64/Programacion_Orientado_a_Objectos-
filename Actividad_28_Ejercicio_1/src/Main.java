public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Daniel", 19, "A123456");

        // Solo mostramos si se creó correctamente
        if (estudiante.nombre != null) {
            estudiante.mostrarEstudiante();
        }
    }
}