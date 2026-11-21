abstract class Animal {
    private String nombre;
    private int edad;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos abstractos
    public abstract int calcularEdadHumana();
    public abstract String emitirSonido();

    // Método concreto
    public void mostrarDatos() {
        System.out.println("\nDatos del animal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Edad humana: " + calcularEdadHumana() + " años");
        System.out.println("Sonido: " + emitirSonido());
    }
}