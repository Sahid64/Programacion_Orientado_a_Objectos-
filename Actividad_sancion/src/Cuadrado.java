public class Cuadrado extends Figura{

    public Cuadrado(double perimetro, double lado, double altura,double base, double radio) {
        super(perimetro,lado,altura,base,radio);
    }

    @Override
    public double calcularPerimetro(){
        return lado*4;
    }
}
