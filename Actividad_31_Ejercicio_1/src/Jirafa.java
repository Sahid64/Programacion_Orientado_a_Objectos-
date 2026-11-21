public class Jirafa extends Animal {
    public double altura;

    public Jirafa(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    public void comerHojas() {
        System.out.println("La jirafa come hojas altas");
    }
}