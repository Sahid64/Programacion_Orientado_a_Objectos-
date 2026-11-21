public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Rojo", 10.5);
        if (circulo1.color != null) {
            circulo1.mostrarColor();
            double area = circulo1.calcularArea();
            System.out.println("El área del círculo es: " + area);
        }
    }
}