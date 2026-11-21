public class HidroAvion extends Vehiculo implements Volador, Acuatico {

    public HidroAvion(String nombre) {
        super(nombre);
    }

    public void volar() {
        if (nombre != null && !nombre.trim().isEmpty()) {
            System.out.println(nombre + " está volando.");
        } else {
            System.out.println("Error: nombre del vehículo inválido para volar.");
        }
    }

    public void navegar() {
        if (nombre != null && !nombre.trim().isEmpty()) {
            System.out.println(nombre + " está navegando.");
        } else {
            System.out.println("Error: nombre del vehículo inválido para navegar.");
        }
    }
}
