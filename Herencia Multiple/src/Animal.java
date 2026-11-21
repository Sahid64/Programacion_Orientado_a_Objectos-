class Animal {
    String nombre;

    // Constructor para inicializar el nombre
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método común para comer
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}
