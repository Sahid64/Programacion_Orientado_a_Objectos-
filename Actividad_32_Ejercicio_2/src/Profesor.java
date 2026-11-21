public class Profesor extends Persona {
    public String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        if (materia == null || materia.isEmpty()) {
            throw new IllegalArgumentException("La materia no puede estar vacía.");
        }
        this.materia = materia;
    }

    public void darClase() {
        System.out.println("El profesor está dando clase.");
    }
}