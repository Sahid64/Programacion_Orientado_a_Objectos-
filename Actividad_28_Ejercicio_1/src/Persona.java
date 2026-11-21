public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        if (nombre.length() < 3 || contieneNumero(nombre)) {
            System.out.println("Nombre inválido. Debe tener al menos 3 letras y no contener números.");
            return;
        }
        if (edad < 6 || edad > 100) {
            System.out.println("Edad inválida. Debe estar entre 6 y 100 años.");
            return;
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    private boolean contieneNumero(String texto) {
        for (int i = 0; i < texto.length(); i++) { //Cadena de texto
            if (Character.isDigit(texto.charAt(i))) {
                //Verifica si ese carácter es un número.
                //Obtiene el carácter en la posición i de la cadena texto.
                return true;
            }
        }
        return false;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}