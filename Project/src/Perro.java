public class Perro {
    public String nombre;
    public double peso;
    public double tamano;
    // Constructor de la clase Gato: inicializa los atributos al crear un objeto
    public Perro(String nombre, double peso, double tamano) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamano = tamano;
    }
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Woof");
    }
    public void darComer() {
        System.out.println("Le estás dando comida a " + this.nombre);
    }
    public void ladrar() {
        System.out.println(this.nombre + " está ladrando... ¡Woof, Woof, Woof!");
    }
}
