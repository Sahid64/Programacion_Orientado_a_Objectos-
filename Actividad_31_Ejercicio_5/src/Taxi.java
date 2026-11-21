public class Taxi extends Transporte {
    public String numeroLicencia;

    public Taxi(String nombre, int capacidad, String numeroLicencia) {
        super(nombre, capacidad);
        this.numeroLicencia = numeroLicencia;
    }

    public void iniciarViaje() {
        System.out.println("El taxi con licencia " + numeroLicencia + " inicia un nuevo viaje");
    }
}