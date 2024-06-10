package exercicios.um;

public class Produto {
    private String nome;
    private double preco;

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }

    public double getPreco () {
        return preco;
    }

    public void aplicarDesconto (double percentual) {
        preco -= (preco * percentual / 100);
    }


}
