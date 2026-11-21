import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la marca: ");
        String marca = sc.next();
        System.out.println("Ingresa el modelo: ");
        String modelo = sc.next();
        System.out.println("Ingresa la velocidad maxima: ");
        double velocidadMaxima = sc.nextDouble();
        System.out.println("Ingrsa el gasto de gasolina por litro: ");
        double gastoGasolinaPorLitro = sc.nextDouble();
        Coche coche = new Coche(marca,modelo,velocidadMaxima,gastoGasolinaPorLitro);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad maxima: "+velocidadMaxima+" km/h");
        System.out.println("Gasto de gasolina por litro: "+gastoGasolinaPorLitro+" Litros/km");

        System.out.println("¿Quieres cambiear algun atributo del coche? (si/no)");
        String respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("si")){
            System.out.println("¿Que te gustaria cambiar?");
            System.out.println("1. Marca");
            System.out.println("2. Modelo");
            System.out.println("3. Velocidad maxima");
            System.out.println("4. gasto de gasolina por litro");
            System.out.println("Selecciona una opcion: ");
            int opcion = sc.nextInt();
            if (opcion==1){
                System.out.println("Ingresa la nueva marca: ");
                coche.setMarca(sc.next());
            } else if (opcion==2){
                System.out.println("Ingresa el nuevo modelo: ");
                coche.setModelo(sc.next());
            } else if (opcion==3){
                System.out.println("Ingresa la nueva velocidad maxima: ");
                coche.setVelocidadMaxima(sc.nextDouble());
            } else if (opcion==4) {
                System.out.println("Ingresa el nuevo consumo de gasolina por litro: ");
                coche.setGastoGasolinaPorLitro(sc.nextDouble());
            } else {
                System.out.println("Opción invalida");
            }
            System.out.println("Informacion actualizada");
            System.out.println("Marca: "+coche.getMarca());
            System.out.println("Modelo: "+coche.getModelo());
            System.out.println("Velocidad maxima: "+coche.getVelocidadMaxima()+" km/h");
            System.out.println("Gasto de gasolina por litro: "+coche.getGastoGasolinaPorLitro()+" Litros/km");

            System.out.println("Ingrese una distancia: (en kilometros)");
            double distancia = sc.nextDouble();
            coche.calcularGastoDeGasolina(distancia);
        }

    }
}