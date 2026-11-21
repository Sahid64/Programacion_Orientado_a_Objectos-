public class Guitarra extends Instrumento{
    public Guitarra(String nombre, int volumen, double costoMantenimientoBase){
        super(nombre,volumen,costoMantenimientoBase);
    }
    @Override
    public void tocar(){
        System.out.println("La guitarra suena con energia");
    }
    @Override
    public double calcularCostoMantenimiento(){
        return super.costoMantenimientoBase*1.10;
    }
}
