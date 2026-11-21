public class CuentaBancaria {
    public String titular;
    public String numeroCuenta;
    public double saldo;
        public CuentaBancaria(String titular, String numeroCuenta, double saldo){
            this.titular = titular;
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
        }
        public void depositar(double cantidad){
            saldo += cantidad;
            System.out.println("Acción realizada");
        }
        public void retirar(double cantidad){
            saldo -= cantidad;
            if (saldo<0){
                System.out.println("Saldo insuficiente");
                saldo +=cantidad;
            }
        }
        public void mostrarSaldo(){
            System.out.println("Saldo: "+saldo);
        }
}