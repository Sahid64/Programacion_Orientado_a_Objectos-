public class Circulo {
    public double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public void calcularArea() {
        double area = Math.PI*(radio * radio);
        System.out.println("El area del circulo es: "+area);
    }
    public void calcularCircunferencia(){
        double circunferencia = 2*Math.PI*radio;
        System.out.println("La circunferencia es de: "+circunferencia);
    }
}