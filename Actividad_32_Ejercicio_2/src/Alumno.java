public class Alumno extends Persona {
    public String carrera;

    public Alumno(String nombre, int edad, String carrera) {
        super(nombre, edad);
        if (carrera == null || carrera.isEmpty()) {
            throw new IllegalArgumentException("La carrera no puede estar vacía.");
        }
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println("El alumno está estudiando.");
    }
}