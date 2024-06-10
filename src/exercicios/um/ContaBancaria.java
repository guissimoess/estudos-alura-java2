package exercicios.um;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public void setNumerConta (int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta () {
        return numeroConta;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public double saldo () {
        return saldo;
    }

    public void setTitular (String titular ) {
        this.titular = titular;
    }

    public String getTitular () {
        return titular;
    }
}
