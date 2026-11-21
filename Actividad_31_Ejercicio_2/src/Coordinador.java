public class Coordinador extends Persona {
    public String departamento;
    public Coordinador(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    public void coordinar() {
        System.out.println("El coordinador organiza actividades");
    }
}