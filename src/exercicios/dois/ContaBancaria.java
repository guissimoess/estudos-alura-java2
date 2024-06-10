package exercicios.dois;

public class ContaBancaria {
    protected double saldo;

    public void depositar (double valor) {
        this.saldo = valor;
    }

    public void sacar (double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }

    }

    public double verificarSaldo () {
        return saldo;
    }
}
