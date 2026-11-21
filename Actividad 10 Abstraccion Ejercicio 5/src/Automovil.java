public class Automovil {
    public String marca;
    public String modelo;
    public int anio;
    public double kilometraje;

    public Automovil(String marca, String modelo, int anio, double kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }
    public void coducir(double km){
        kilometraje = km;
    }
    public void informacion(){
        System.out.println("Marca: "+marca+", Modelo: "+modelo+", Año: "+anio+", Kilometraje: "+kilometraje);
    }
}