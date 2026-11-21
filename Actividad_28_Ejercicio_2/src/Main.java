public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "ABC1234");
        if (auto.placa != null) {  // Verificamos que la placa sea válida
            auto.encender();
            auto.tocarBocina();
        }
    }
}