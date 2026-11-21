public class Circulo extends Figura {
    public double radio;
    public Circulo(String color, double radio) {
        super(color);
        if (radio >= 0.5 && radio <= 100) {
            this.radio = radio;
        } else {
            System.out.println("El radio debe estar entre 0.5 y 100.");
        }
    }
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}