public class Empleado{
    public String nombre;
    public int sueldo;
    public Empleado(String nombre, int sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);
    }
}