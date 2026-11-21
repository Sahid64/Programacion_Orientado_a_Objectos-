public class Perro extends Animal{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public int calcularEdadHumana(){
        return getEdad()*7;
    }
    @Override
    public String emitirSonido(){
        return "¡Gua!";
    }
}
