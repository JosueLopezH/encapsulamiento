package ejemploDeEncapsulamiento;

public class cuentaBancaria {
        private String numeroDeCuenta;
        private double saldo;


        public cuentaBancaria(String numeroDeCuenta, double saldoInicial) {
            this.numeroDeCuenta = numeroDeCuenta;
            this.saldo = saldoInicial;
        }

        public String getNumeroDeCuenta() {
            return numeroDeCuenta;
        }


        public double getSaldo() {
            return saldo;
        }

        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
            } else {
                System.out.println("La cantidad a depositar debe ser mayor que 0.");
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
            } else if (cantidad > saldo) {
                System.out.println("Fondos insuficientes.");
            } else {
                System.out.println("La cantidad a retirar debe ser mayor que 0.");
            }
        }

        public static void main(String[] args) {

            cuentaBancaria cuenta = new cuentaBancaria("123456789", 1000.0);


            System.out.println("Número de cuenta: " + cuenta.getNumeroDeCuenta());
            System.out.println("Saldo inicial: " + cuenta.getSaldo());


            cuenta.depositar(500.0);
            cuenta.retirar(200.0);
            cuenta.retirar(1500.0);
            cuenta.depositar(-100.0);
        }
    }
