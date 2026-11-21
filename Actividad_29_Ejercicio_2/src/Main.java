public class Main {
    public static void main(String[] args) {
        Camion miCamion = new Camion("Cat", "FH16", 25000);
        miCamion.mover();
        miCamion.encenderMotor();
        miCamion.cargar();
    }
}