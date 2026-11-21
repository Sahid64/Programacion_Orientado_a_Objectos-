public class Main {
    public static void main(String[] args) {
        String marca = "Volvo";
        String modelo = "FH16";
        double capacidadCarga = 18000.5;

        if (marca.isEmpty()) {
            System.out.println("Error: La marca no puede estar vacía.");
            return;
        }

        if (modelo.isEmpty()) {
            System.out.println("Error: El modelo no puede estar vacío.");
            return;
        }

        if (capacidadCarga <= 0) {
            System.out.println("Error: La capacidad de carga debe ser mayor que 0.");
            return;
        }

        Camion miCamion = new Camion(marca, modelo, capacidadCarga);

        miCamion.mover();
        miCamion.encenderMotor();
        miCamion.cargar();
    }
}