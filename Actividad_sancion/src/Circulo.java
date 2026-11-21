public class Circulo extends Figura{

    public Circulo(double perimetro, double lado, double altura,double base, double radio) {
        super(perimetro, lado, altura, base,radio);
    }

    @Override
    public double calcularPerimetro(){
        return Math.PI*Math.pow(radio,2);
    }
}
