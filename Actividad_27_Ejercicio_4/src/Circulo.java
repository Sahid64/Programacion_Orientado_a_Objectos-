public class Circulo extends Figura{
    public int radio;
    public Circulo(String color, int radio){
        super(color);
        this.radio=radio;
    }
    public void calcularArea(){
        System.out.println(" Radio: "+radio);
    }
}