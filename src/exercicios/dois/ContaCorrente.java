package exercicios.dois;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal () {
        saldo -= tarifaMensal;
    }
}
