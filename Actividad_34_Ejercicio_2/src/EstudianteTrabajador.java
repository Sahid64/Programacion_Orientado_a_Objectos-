public class EstudianteTrabajador extends Persona implements Estudiante, Trabajador {
    public EstudianteTrabajador(String nombre, int edad) {
        super(nombre, edad);
    }

    public void estudiar() {
        if (datosValidos()) {
            System.out.println(nombre + " está estudiando.");
        } else {
            System.out.println("Error: nombre o edad inválidos para estudiar.");
        }
    }

    public void trabajar() {
        if (datosValidos()) {
            System.out.println(nombre + " está trabajando.");
        } else {
            System.out.println("Error: nombre o edad inválidos para trabajar.");
        }
    }
}
