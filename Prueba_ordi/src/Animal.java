public class Animal {
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    private String nombre;
    private int edad;

    public String getNombre(String nombre) {
        return nombre;
    }
    public int getEdad(int edad) {
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public abstract int calcularEdadHumana();
    public abstract String emitirSonido();
    public void mostrarDatos(){
        System.out.println("Mostrar datos");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Edad humana: "+emitirSonido());
    }
}
