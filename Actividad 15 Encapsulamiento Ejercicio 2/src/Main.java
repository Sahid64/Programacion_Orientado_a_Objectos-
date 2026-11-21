import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingresa el autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Ingresa el año del libro: ");
        int anioPubli = sc.nextInt();

        Libro libro = new Libro(titulo,autor,anioPubli);
        System.out.println("\nInformacion del libro: ");
        System.out.println("Titulo: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Año: "+libro.getAnioPubli());

        System.out.println("\n¿Quieres cambiar algo del libro? (si/no)");
        sc.nextLine();
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")){
            System.out.println("¿Que quieres cambia?");
            System.out.println("1. Titulo");
            System.out.println("2. Autor");
            System.out.println("3. Año de publicacion");
            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion==1){
                System.out.println("Ingresa el nuevo titulo: ");
                libro.setTitulo(sc.nextLine());
            } else if (opcion==2){
                System.out.println("Ingresa el nuevo autor: ");
                libro.setAutor(sc.nextLine());
            } else if (opcion==3) {
                System.out.println("Ingresa el nuevo año de publicacion: ");
                libro.setAnioPubli(sc.nextInt());
            }
        }
        System.out.println("\nInformacion del libro actualizada: ");
        System.out.println("Titulo: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Año: "+libro.getAnioPubli());

        libro.verificarAnio();
    }
}