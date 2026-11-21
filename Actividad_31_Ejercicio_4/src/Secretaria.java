public class Secretaria extends Empleado {
    String nivel;

    public Secretaria(String nombre, double salario, String nivel) {
        super(nombre, salario);
        this.nivel = nivel;
    }

    public void agendarReunion() {
        System.out.println("La secretaria de nivel " + nivel + " agenda una reunión");
    }
}