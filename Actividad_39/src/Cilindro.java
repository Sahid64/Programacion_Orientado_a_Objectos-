public class Cilindro extends Figura3D{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura){
        super("Cilindro");
        setRadio(radio);
        getAltura(altura);
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        if (radio>0){
            this.radio=radio;
        }else{
            System.out.println("El radio debe de ser mayor que 0");
        }
    }
    public double getAltura(double altura){
        return this.altura;
    }
    public void setAltura(double altura){
        if (altura > 0) {
            this.altura=altura;
        }else {
            System.out.println("El cilindro debe de ser mayor a 0");
        }
    }
    @Override
    public double calcularVolumen(){
        return Math.PI*Math.pow(radio,2)*altura;
    }
}
