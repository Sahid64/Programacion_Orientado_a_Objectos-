public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        if (!validarMatricula(matricula)) {
            System.out.println("Matrícula inválida. Debe empezar con una letra y tener al menos 6 números después.");
            return;
        }
        this.matricula = matricula;
    }

    private boolean validarMatricula(String matricula) {
        // Verifica que la matrícula tenga al menos 7 caracteres
        if (matricula.length() < 7) {
            return false;
        }

        // El primer carácter debe ser una letra
        if (!Character.isLetter(matricula.charAt(0))) {
            return false;
        }

        // Verifica que los 6 siguientes caracteres sean dígitos
        int contadorNumeros = 0;
        for (int i = 1; i < matricula.length(); i++) {
            if (Character.isDigit(matricula.charAt(i))) {
                contadorNumeros++;
            }
        }

        // La matrícula es válida si tiene al menos 6 números después de la letra inicial
        return contadorNumeros >= 6;
    }

    public void mostrarEstudiante() {
        mostrarDatos();  // Llama al método mostrarDatos de la clase Persona para mostrar nombre y edad
        System.out.println("Matrícula: " + matricula);
    }
}
