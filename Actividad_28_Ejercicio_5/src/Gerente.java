public class Gerente extends Empleado {
    public String departamento;
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        if (departamento.equalsIgnoreCase("TI") ||
                departamento.equalsIgnoreCase("Ventas") ||
                departamento.equalsIgnoreCase("Recursos Humanos")) {
            this.departamento = departamento;
        } else {
            System.out.println("Departamento inválido.");
        }
    }
    public void mostrarInfo() {
        if (departamento != null && nombre != null && sueldo >= 7000) {
            super.mostrarInfo(); // llama al método de Empleado
            System.out.println("Departamento: " + departamento);
        }
    }
}
