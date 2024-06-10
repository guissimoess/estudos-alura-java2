package exercicios.dois;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimabilidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
