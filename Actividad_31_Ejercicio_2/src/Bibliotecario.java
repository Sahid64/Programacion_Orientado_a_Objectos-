public class Bibliotecario extends Persona {
    public String turno;
    public Bibliotecario(String nombre, int edad, String turno) {
        super(nombre, edad);
        this.turno = turno;
    }
    public void prestarLibro() {
        System.out.println("Libro prestado al alumno");
    }
}