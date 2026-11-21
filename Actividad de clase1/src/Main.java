import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Producto producto = new Producto("","",0,0);
    Factura factura = new Factura("","", "");
    Cliente cliente = new Cliente("","","","");



    for(;;){
        System.out.println("\nMenu");
        System.out.println("1. Crear Producto");
        System.out.println("2. Crear Factura");
        System.out.println("3. Crear Cliente");
        System.out.println("4. Mostrar Producto");
        System.out.println("5. Mostrar Factura");
        System.out.println("6. Mostrar Cliente");
        System.out.println("7. Cambiar Atributos de Producto");
        System.out.println("8. Cambiar Atributos de Factura");
        System.out.println("9. Cambiar Atributos de Cliente");
        System.out.println("10. Salir");
        int opcion = sc.nextInt();
        //Opcion "Crear producto" 1
        if (opcion ==1){
            System.out.println("Ingresa la ID del producto: ");
            String idProducto = sc.nextLine();
            System.out.println("Ingresa el Nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa el precio: ");
            double precio = sc.nextDouble();
            System.out.println("Ingresa la cantidad: ");
            int cantidad = sc.nextInt();
            producto = new Producto(idProducto,nombre,precio,cantidad);
        }

        //Opcion "Crear Factura" 2
        if (opcion==2){
            System.out.println("Ingresa la ID de la factura: ");
            String idProducto = sc.nextLine();
            System.out.println("Ingresa el Nombre del producto: ");
            String producto = sc.nextLine();
            System.out.println("Ingresa el numero de factura: ");
            String numeroFactura = sc.nextLine();
            factura = new Factura(idProducto,producto,numeroFactura);
        }

        //Opcion "Crear Cliente" 3
        if (opcion==3){

        }

        //Opcion "Mostrar Producto" 4
        if (opcion==4){

        }

        //Opcion "Mostrar Factura" 5
        if (opcion==5){

        }

        //Opcion "Mostrar Cliente" 6
        if (opcion==6){

        }

        //Opcion "Cambiar atributos de Producto" 7
        if (opcion==7){

        }

        //Opcion "Cambiar atributos de Factura" 8
        if (opcion==8){

        }

        //Opcion "Cambiar atributos de Cliente" 9
        if (opcion==9){

        }

        //Opcion "Salir" 10
        if (opcion==10) {
            break;
        }
    }
}


/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de serie del vehiculo: ");
        int numSerie = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa la marca: ");
        String marca = sc.nextLine();
        System.out.println("Ingresa el modelo: ");
        String modelo = sc.nextLine();
        Vehiculo vehiculo = new Vehiculo(numSerie, marca, modelo);

        while (true) {
            System.out.println("\n¿Que quieres hacer?");
            System.out.println("1. Cambiar numero de serie");
            System.out.println("2. Cambiar la marca");
            System.out.println("3. Cambiar el modelo");
            System.out.println("4. Mostrar informacion");
            System.out.println("5. Salir");
            int num = sc.nextInt();
            sc.nextLine();

            if (num == 1) {
                System.out.println("Ingresa el nuevo numero de serie: ");
                vehiculo.setNumSerie(sc.nextInt());
                sc.nextLine();
            } else if (num == 2) {
                System.out.println("Ingresa la nueva marca: ");
                vehiculo.setMarca(sc.nextLine());
            } else if (num == 3) {
                System.out.println("Ingresa el nuevo modelo: ");
                vehiculo.setModelo(sc.nextLine());
            } else if (num == 4) {
                System.out.println("\nInformacion del vehiculo:");
                System.out.println("Numero de serie: " + vehiculo.getNumSerie());
                System.out.println("Marca: " + vehiculo.getMarca());
                System.out.println("Modelo: " + vehiculo.getModelo());
            } else if (num == 5) {
                System.out.println("Saliendo del programa. ¡Adiós!");
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo nuevamente.");
            }
        }
    }
}

 */