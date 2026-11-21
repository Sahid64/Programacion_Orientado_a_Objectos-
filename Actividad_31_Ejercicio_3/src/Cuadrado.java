public class Cuadrado extends FiguraGeometrica {
    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}