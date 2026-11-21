class Gato extends Animal {
    @Override
    public int calcularEdadHumana() {
        return getEdad() * 6; // Cada año de gato equivale a 6 humanos
    }

    @Override
    public String emitirSonido() {
        return "¡Miau!";
    }
}