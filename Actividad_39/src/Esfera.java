public class Esfera extends Figura3D{
    private double radio;
    public Esfera(double radio){
        super("Esfera");
        setRadio(radio);
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        if (radio > 0) {
            this.radio=radio;
        }else {
            System.out.println("El radio debe de ser mayor a 0");
        }
    }
    @Override
    public double calcularVolumen(){
        return (4.0/3.0)*Math.PI*Math.pow(radio,3);
    }
}
