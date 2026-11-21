public class Disenador extends Empleado {
    String herramienta;

    public Disenador(String nombre, double salario, String herramienta) {
        super(nombre, salario);
        this.herramienta = herramienta;
    }

    public void disenar() {
        System.out.println("El diseñador crea diseños con " + herramienta);
    }
}