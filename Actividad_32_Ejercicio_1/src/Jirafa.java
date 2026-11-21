public class Jirafa extends Animal {
    public double altura;

    public Jirafa(String nombre, int edad, double altura) {
        super(nombre, edad);
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0.");
        }
        this.altura = altura;
    }

    public void comerHojas() {
        System.out.println("La jirafa come hojas altas");
    }
}