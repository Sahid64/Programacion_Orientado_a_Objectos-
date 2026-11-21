public class RegistroVehicular {
    private Vehiculo[] vehiculos = new Vehiculo[100];
    private int contador = 0;

    public void agregarVehiculo(Vehiculo v) {
        if (buscadorVehiculoPorPlaca(v.getPlaca()) == null) {
            vehiculos[contador] = v;
            contador++;
        } else {
            System.out.println("Error, la placa ya esta registrada");
        }
    }

    public Vehiculo buscadorVehiculoPorPlaca(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equals(placa)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public void mostrarTodosVehiculos() {
        if (contador == 0) {
            System.out.println("No hay vehiculos registrados");
        } else {
            for (int i = 0; i < contador; i++) {
                vehiculos[i].mostrarDetalles();
                System.out.println("------------");
            }
        }
    }
}