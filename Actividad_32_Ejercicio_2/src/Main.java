public class Main {
    public static void main(String[] args) {

        System.out.println("Objetos válidos:");
        try {
            Alumno alumno = new Alumno("Juan", 20, "Ingeniería");
            alumno.saludar();
            alumno.estudiar();

            Profesor profesor = new Profesor("Carlos", 35, "Matemáticas");
            profesor.saludar();
            profesor.darClase();

            Coordinador coordinador = new Coordinador("Ana", 40, "Departamento de Ciencias");
            coordinador.saludar();
            coordinador.coordinar();

            Secretario secretario = new Secretario("Pedro", 30, "Oficina 101");
            secretario.saludar();
            secretario.atender();

            Bibliotecario bibliotecario = new Bibliotecario("Sofía", 28, "tarde");
            bibliotecario.saludar();
            bibliotecario.prestarLibro();

        } catch (Exception e) {
            System.out.println("Error al crear un objeto válido: " + e.getMessage());
        }

        System.out.println("\nCasos inválidos:");

        try {
            new Alumno("", 20, "Ingeniería");
        } catch (Exception e) {
            System.out.println("Error Alumno: " + e.getMessage());
        }

        try {
            new Profesor("Carlos", 17, "Matemáticas");
        } catch (Exception e) {
            System.out.println("Error Profesor: " + e.getMessage());
        }

        try {
            new Coordinador("Ana", 22, "");
        } catch (Exception e) {
            System.out.println("Error Coordinador: " + e.getMessage());
        }

        try {
            new Secretario("Pedro", 30, "");
        } catch (Exception e) {
            System.out.println("Error Secretario: " + e.getMessage());
        }

        try {
            new Bibliotecario("Sofía", 28, "mañanaX");
        } catch (Exception e) {
            System.out.println("Error Bibliotecario: " + e.getMessage());
        }
    }
}