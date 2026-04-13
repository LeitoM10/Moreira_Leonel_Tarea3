class CuentaBancaria {

    private String nombreTitular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String nombreTitular, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("------------------------");
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de $" + monto + " realizado.");
        } else {
            System.out.println("Monto inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Retiro de $" + monto + " realizado.");
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("Monto inválido.");
        }
    }
}