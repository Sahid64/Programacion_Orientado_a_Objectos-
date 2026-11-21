public class Secretario extends Persona {
    public String oficina;
    public Secretario(String nombre, int edad, String oficina) {
        super(nombre, edad);
        this.oficina = oficina;
    }
    public void atender() {
        System.out.println("El secretario atiende en la oficina");
    }
}