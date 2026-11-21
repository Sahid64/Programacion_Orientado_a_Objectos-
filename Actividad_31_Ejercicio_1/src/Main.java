public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon("Simba", 5, true);
        Elefante elefante = new Elefante("Dumbo", 8, 5000.5);
        Jirafa jirafa = new Jirafa("Gira", 3, 5.5);
        Cebra cebra = new Cebra("Zebrina", 2, 80);
        Mono mono = new Mono("Chico", 4, "Capuchino");

        leon.hacerSonido();
        leon.rugir();

        elefante.hacerSonido();
        elefante.usarTrompa();

        jirafa.hacerSonido();
        jirafa.comerHojas();

        cebra.hacerSonido();
        cebra.correr();

        mono.hacerSonido();
        mono.trepar();
    }
}
