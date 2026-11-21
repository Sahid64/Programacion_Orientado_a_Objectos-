public class Rectangulo extends Figura{

    public Rectangulo(double perimetro, double lado, double altura, double base, double radio) {
        super(perimetro, lado, altura, base,radio);
    }

    @Override
    public double calcularPerimetro(){
        return base*2+altura*2;
    }
}
