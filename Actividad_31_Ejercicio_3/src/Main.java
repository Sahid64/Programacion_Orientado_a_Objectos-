public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Verde", 4, 6);
        Cuadrado cuadrado = new Cuadrado("Azul", 3);
        Triangulo triangulo = new Triangulo("Amarillo", 4, 5);
        Trapecio trapecio = new Trapecio("Naranja", 6, 4, 3);

        circulo.mostrarColor();
        System.out.println("Área del círculo: " + circulo.calcularArea());

        rectangulo.mostrarColor();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        cuadrado.mostrarColor();
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());

        triangulo.mostrarColor();
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        trapecio.mostrarColor();
        System.out.println("Área del trapecio: " + trapecio.calcularArea());
    }
}