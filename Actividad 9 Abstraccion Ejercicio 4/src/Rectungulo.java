public class Rectungulo {
    public double base;
    public double altura;

    public Rectungulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void calcularArea(){
        double area = base*altura;
        System.out.println("El area del rectangulo es: "+area);
    }
    public void calcularPerimetro(){
        double perimetro = (base+altura)*2;
        System.out.println("El perimetro es de: "+perimetro);
    }
}
