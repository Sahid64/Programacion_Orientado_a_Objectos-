public class Piano extends Instrumento{

    public Piano(String nombre, int volumen, double costoMantenimientoBase) {
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    public void tocar(){
        System.out.println("La piano interpreta unq melodía clásica");
    }
    @Override
    public double calcularCostoMantenimiento(){
        return super.costoMantenimientoBase*1.20;
    }
}