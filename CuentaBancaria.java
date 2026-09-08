public class CuentaBancaria {
    private String titular;
    private String nroCuenta;
    private double saldo;

    
    public CuentaBancaria(String titular, String nroCuenta, double saldoInicial) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: No se puede depositar montos negativos o iguales a cero.");
        } else {
            saldo += monto;
            System.out.println("Depósito exitoso de Bs. " + monto + ". Nuevo saldo: Bs. " + saldo);
        }
    }

    
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes. Intenta retirar más dinero del disponible en la cuenta.");
        } else if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a cero.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso de Bs. " + monto + ". Saldo restante: Bs. " + saldo);
        }
    }

    
    public void mostrarDatos() {
        System.out.println("Titular: " + titular + " | Nro Cuenta: " + nroCuenta + " | Saldo Actual: Bs. " + saldo);
    }
}
