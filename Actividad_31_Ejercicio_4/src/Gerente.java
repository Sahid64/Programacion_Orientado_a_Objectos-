public class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void dirigir() {
        System.out.println("El gerente dirige el departamento de " + departamento);
    }
}