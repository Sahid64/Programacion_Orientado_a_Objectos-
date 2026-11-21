class Perro extends Animal {
    @Override
    public int calcularEdadHumana() {
        return getEdad() * 7; // Cada año de perro equivale a 7 humanos
    }

    @Override
    public String emitirSonido() {
        return "¡Guau!";
    }
}