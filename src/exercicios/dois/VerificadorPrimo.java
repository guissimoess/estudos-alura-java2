package exercicios.dois;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimabilidade(numero)) {
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }
    }

}
