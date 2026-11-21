public class Figura {
    double perimetro;
    double lado;
    double altura;
    double base;
    double radio;
    public Figura(double perimetro,double lado, double altura, double base, double radio){
        this.perimetro=perimetro;
        this.lado=lado;
        this.altura=altura;
        this.base=base;
        this.radio=radio;
    }
    public double calcularPerimetro(){
        return perimetro;
    }
}
