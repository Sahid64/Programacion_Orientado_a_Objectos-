public class Metro extends Transporte {
    public String linea;

    public Metro(String nombre, int capacidad, String linea) {
        super(nombre, capacidad);
        this.linea = linea;
    }

    public void abrirPuertas() {
        System.out.println("El metro de la línea " + linea + " abre sus puertas");
    }
}