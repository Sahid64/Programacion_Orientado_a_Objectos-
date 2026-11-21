public class BicicletaPublica extends Transporte {
    public int idEstacion;

    public BicicletaPublica(String nombre, int capacidad, int idEstacion) {
        super(nombre, capacidad);
        this.idEstacion = idEstacion;
    }

    public void liberarBicicleta() {
        System.out.println("Bicicleta pública liberada desde la estación #" + idEstacion);
    }
}