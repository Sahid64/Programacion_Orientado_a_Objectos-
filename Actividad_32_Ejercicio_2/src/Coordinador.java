public class Coordinador extends Persona {
    public String departamento;

    public Coordinador(String nombre, int edad, String departamento) {
        super(nombre, edad);
        if (departamento == null || departamento.isEmpty()) {
            throw new IllegalArgumentException("El departamento no puede estar vacío.");
        }
        this.departamento = departamento;
    }

    public void coordinar() {
        System.out.println("El coordinador organiza actividades.");
    }
}