package exercicios.um;

public class idadePessoa {
    private String nome;
    private int idade;

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome (String nome) {
        return nome;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getIdade (int idade) {
        return idade;
    }

    public boolean eMaiorDeIdade () {
        return idade >= 18;
    }




}
