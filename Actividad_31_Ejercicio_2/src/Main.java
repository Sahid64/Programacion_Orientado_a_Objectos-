public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Carlos", 20, "Ingeniería");
        Profesor profesor = new Profesor("María", 45, "Matemáticas");
        Coordinador coordinador = new Coordinador("Luis", 40, "Ciencias");
        Secretario secretario = new Secretario("Ana", 35, "Oficina 3");
        Bibliotecario bibliotecario = new Bibliotecario("Pedro", 50, "Mañana");

        alumno.saludar();
        alumno.estudiar();

        profesor.saludar();
        profesor.darClase();

        coordinador.saludar();
        coordinador.coordinar();

        secretario.saludar();
        secretario.atender();

        bibliotecario.saludar();
        bibliotecario.prestarLibro();
    }
}
