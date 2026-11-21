public class Circulo extends FiguraGeometrica {
    double radio;

    public Circulo(String color, double radio) {
        super(color);
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que 0.");
        }
        this.radio = radio;
    }

    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo: " + area);
    }
}