public class EmpleadoCliente extends Persona implements EmpleadoEnProyecto, Cliente {
    public EmpleadoCliente(String nombre, String rol) {
        super(nombre, rol);
    }

    public void trabajarEnProyecto() {
        if (datosValidos() && rol.equalsIgnoreCase("Empleado")) {
            System.out.println(nombre + " está trabajando en un proyecto.");
        } else {
            System.out.println("Error: El nombre o el rol es inválido para trabajar en un proyecto.");
        }
    }

    public void realizarCompra() {
        if (datosValidos() && rol.equalsIgnoreCase("Cliente")) {
            System.out.println(nombre + " está realizando una compra.");
        } else {
            System.out.println("1Error: El nombre o el rol es inválido para realizar una compra.");
        }
    }
}
