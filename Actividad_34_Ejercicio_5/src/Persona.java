public class Persona {
    public String nombre;
    public String rol;

    public Persona(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    protected boolean datosValidos() {
        return nombre != null && !nombre.trim().isEmpty() && (rol.equalsIgnoreCase("Empleado") || rol.equalsIgnoreCase("Cliente"));
    }
}
