public class Cubo extends Figura3D{
    private double lado;
    public Cubo(double lado){
        super("Cubo");
        setLado(lado);
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        if (lado>0){
            this.lado=lado;
        }else {
            System.out.println("El lado debe ser mayor que 0.");
        }
    }
    @Override
    public double calcularVolumen(){
        return lado*lado*lado;
    }
}
