public class Gato extends Animal{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public int calcularEdadHumana(){
        return getEdad()*6;
    }
    @Override
    public String emitirSonido(){
        return "¡Miau!";
    }
}
