public class Main {
    public static void main(String[] args) {
        System.out.println("~~ Objetos válidos ~~");
        try { //Perminte lanzar una excepcion
            Leon leon = new Leon("Simba", 5, true);
            leon.hacerSonido();
            leon.rugir();

            Elefante elefante = new Elefante("Dumbo", 10, 5000);
            elefante.usarTrompa();

            Jirafa jirafa = new Jirafa("Gira", 7, 4.5);
            jirafa.comerHojas();

            Cebra cebra = new Cebra("Zara", 4, 80);
            cebra.correr();

            Mono mono = new Mono("Chico", 3, "Capuchino");
            mono.trepar();
        } catch (Exception e) {
            //Permite los errores sin cerrar
            //O bien, hace la excepcion de permitir el error
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n~~ Casos inválidos ~~");
        try {
            new Leon("", 4, false);
        } catch (Exception e) {
            System.out.println("Leon inválido: " + e.getMessage());
        }

        try {
            new Elefante("Elefant", 5, 0);
        } catch (Exception e) {
            System.out.println("Elefante inválido: " + e.getMessage());
        }

        try {
            new Jirafa("Jirafita", -2, 5);
        } catch (Exception e) {
            System.out.println("Jirafa inválida: " + e.getMessage());
        }

        try {
            new Cebra("Rayitas", 3, -10);
        } catch (Exception e) {
            System.out.println("Cebra inválida: " + e.getMessage());
        }

        try {
            new Mono("Mono", 2, "");
        } catch (Exception e) {
            System.out.println("Mono inválido: " + e.getMessage());
        }
    }
}
