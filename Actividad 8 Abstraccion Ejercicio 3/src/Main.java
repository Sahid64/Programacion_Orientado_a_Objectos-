import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del titular: ");
        String titular = sc.nextLine();
        System.out.print("Ingresa el numero de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Ingresa el saldo base: ");
        double saldo = sc.nextDouble();

        CuentaBancaria tuCuentaBancaria = new CuentaBancaria(titular, numeroCuenta, saldo);
        for(;;){
            System.out.println("<<<Menu>>>");
            System.out.println("Ingresa el numero a la opcion deseada");
            System.out.println("1: Para depositar");
            System.out.println("2: Para retirar");
            System.out.println("3: Para ver saldo");
            System.out.println("4: Para salir");
            int num = sc.nextInt();
            if (num==1){
                System.out.print("Ingresa la cantidad a depositar");
                double cantidad = sc.nextDouble();
                tuCuentaBancaria.depositar(cantidad);
            }
            if (num==2){
                System.out.print("Ingresa la cantidad a retirar: ");
                double cantidad = sc.nextDouble();
                tuCuentaBancaria.retirar(cantidad);
            }
            if (num==3) tuCuentaBancaria.mostrarSaldo();
            if (num==4) break;
            if (num>4) System.out.println("Opción invalida");
        }
    }
}