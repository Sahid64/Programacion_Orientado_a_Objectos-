public class EmpleadoIT implements Programador, Diseñador, Tester {
    private String nombre;
    private String correo;

    public EmpleadoIT(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    private boolean datosValidos() {
        return nombre != null && !nombre.trim().isEmpty() && correo != null && !correo.trim().isEmpty();
        //.trim = elimina los espacios. .isEmpty = verifica que si tiene algo
    }

    public void programar() {
        if (datosValidos()) {
            System.out.println(nombre + " está programando. Contacto: " + correo);
        } else {
            System.out.println("Error: nombre o correo inválido para programar.");
        }
    }

    public void diseniar() {
        if (datosValidos()) {
            System.out.println(nombre + " está diseñando interfaces. Contacto: " + correo);
        } else {
            System.out.println("Error: nombre o correo inválido para diseñar.");
        }
    }

    public void probarSoftware() {
        if (datosValidos()) {
            System.out.println(nombre + " está probando software. Contacto: " + correo);
        } else {
            System.out.println("Error: nombre o correo inválido para probar software.");
        }
    }
}
