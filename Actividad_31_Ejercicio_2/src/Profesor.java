public class Profesor extends Persona {
    public String materia;
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }
    public void darClase() {
        System.out.println("El profesor está dando clase");
    }
}