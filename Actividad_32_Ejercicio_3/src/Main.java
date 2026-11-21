public class Main {
    public static void main(String[] args) {

        System.out.println("Objetos válidos:");
        try {
            Circulo circulo = new Circulo("Rojo", 5);
            circulo.mostrarColor();
            circulo.calcularArea();

            Rectangulo rectangulo = new Rectangulo("Azul", 4, 6);
            rectangulo.mostrarColor();
            rectangulo.calcularArea();

            Cuadrado cuadrado = new Cuadrado("Verde", 3);
            cuadrado.mostrarColor();
            cuadrado.calcularArea();

            Triangulo triangulo = new Triangulo("Amarillo", 4, 3);
            triangulo.mostrarColor();
            triangulo.calcularArea();

            Trapecio trapecio = new Trapecio("Naranja", 6, 4, 5);
            trapecio.mostrarColor();
            trapecio.calcularArea();

        } catch (Exception e) {
            System.out.println("Error al crear una figura válida: " + e.getMessage());
        }

        System.out.println("\nCasos inválidos:");

        try {
            new Circulo("Rojo", -5);
        } catch (Exception e) {
            System.out.println("Error Circulo: " + e.getMessage());
        }

        try {
            new Rectangulo("Azul", 0, 6);
        } catch (Exception e) {
            System.out.println("Error Rectángulo: " + e.getMessage());
        }

        try {
            new Cuadrado("Verde", -3);
        } catch (Exception e) {
            System.out.println("Error Cuadrado: " + e.getMessage());
        }

        try {
            new Triangulo("Amarillo", 4, -3);
        } catch (Exception e) {
            System.out.println("Error Triángulo: " + e.getMessage());
        }

        try {
            new Trapecio("Naranja", 6, 7, 5);
        } catch (Exception e) {
            System.out.println("Error Trapecio: " + e.getMessage());
        }

        try {
            new Trapecio("Azul", 4, 6, 5);
        } catch (Exception e) {
            System.out.println("Error Trapecio (base mayor no es mayor): " + e.getMessage());
        }
    }
}
