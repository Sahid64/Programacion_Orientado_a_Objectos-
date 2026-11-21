public class Alumno extends Persona {
    public String carrera;
    public Alumno(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    public void estudiar() {
        System.out.println("El alumno está estudiando");
    }
}