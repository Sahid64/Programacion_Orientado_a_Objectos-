public class Triangulo extends Figura{
    public double base,altura;
    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}
