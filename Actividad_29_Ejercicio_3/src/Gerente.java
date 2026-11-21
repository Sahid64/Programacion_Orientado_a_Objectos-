public class Gerente extends Empleado {
    public String departamento;
    public Gerente(String nombre, int edad, double sueldo, String departamento) {
        super(nombre, edad, sueldo); // Llama al constructor de Empleado
        this.departamento = departamento;
    }
    public void mostrarDepartamento() {
        System.out.println("Departamento: " + departamento);
    }
}