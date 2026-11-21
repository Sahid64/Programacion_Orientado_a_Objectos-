public class Main {
    public static void main(String[] args) {
        // Crear un Gato válido con especie y color adecuados
        Gato gato1 = new Gato("Gato", "Negro");
        if (gato1.color != null) {
            gato1.hacerSonido();
            gato1.ronronear();
        }
    }
}