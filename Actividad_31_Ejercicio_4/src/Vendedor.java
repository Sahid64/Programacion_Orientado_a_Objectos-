public class Vendedor extends Empleado {
    String zona;

    public Vendedor(String nombre, double salario, String zona) {
        super(nombre, salario);
        this.zona = zona;
    }

    public void vender() {
        System.out.println("El vendedor trabaja en la zona " + zona);
    }
}