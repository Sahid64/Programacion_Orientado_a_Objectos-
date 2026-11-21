public class Robot implements Cocinero, Limpiador, Mensajero {
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    private boolean nombreValido() {
        return nombre != null && !nombre.trim().isEmpty();
    }

    private boolean mensajeValido(String mensaje) {
        return mensaje != null && !mensaje.trim().isEmpty();
    }

    public void cocinar(String mensaje) {
        if (nombreValido() && mensajeValido(mensaje)) {
            System.out.println(nombre + " está cocinando: " + mensaje);
        } else {
            System.out.println("Error: nombre o mensaje inválido para cocinar.");
        }
    }

    public void limpiar(String mensaje) {
        if (nombreValido() && mensajeValido(mensaje)) {
            System.out.println(nombre + " está limpiando: " + mensaje);
        } else {
            System.out.println("Error: nombre o mensaje inválido para limpiar.");
        }
    }
    public void entregarMensajes(String mensaje) {
        if (nombreValido() && mensajeValido(mensaje)) {
            System.out.println(nombre + " está entregando el mensaje: " + mensaje);
        } else {
            System.out.println("Error: nombre o mensaje inválido para entregar mensajes.");
        }
    }
}
