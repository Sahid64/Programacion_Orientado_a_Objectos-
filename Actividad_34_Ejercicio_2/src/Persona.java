public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método de validación
    protected boolean datosValidos() {
        return nombre != null && !nombre.trim().isEmpty() && edad > 0;
    }//.trim = elimina los espacios. .isEmpty = verifica que si tiene algo
}
