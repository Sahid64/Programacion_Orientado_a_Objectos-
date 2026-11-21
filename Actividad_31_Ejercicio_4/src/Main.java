public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura", 80000, "Recursos Humanos");
        Ingeniero ingeniero = new Ingeniero("Carlos", 70000, "Java");
        Secretaria secretaria = new Secretaria("Ana", 40000, "Senior");
        Vendedor vendedor = new Vendedor("Luis", 35000, "Zona Norte");
        Disenador disenador = new Disenador("Pedro", 45000, "Photoshop");

        gerente.mostrarDatos();
        gerente.dirigir();
        System.out.println();

        ingeniero.mostrarDatos();
        ingeniero.programar();
        System.out.println();

        secretaria.mostrarDatos();
        secretaria.agendarReunion();
        System.out.println();

        vendedor.mostrarDatos();
        vendedor.vender();
        System.out.println();

        disenador.mostrarDatos();
        disenador.disenar();
    }
}