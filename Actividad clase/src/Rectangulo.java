public class Rectangulo {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void calcularArea(){
        double area = base*altura;
        if (area>20) {
            System.out.println("Error");

        } else {
            System.out.println("El area del rectángulo es: " + area);
        }
    }
    public void calcularPerimetro(){
        double perimetro = (base+altura)*2;
        if (perimetro>20){
            System.out.println("Error");
        } else {
            System.out.println("El perimetro es de: " + perimetro);
        }
    }
}
