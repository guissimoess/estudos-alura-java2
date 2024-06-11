package br.com.alura.desafio.modelos;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setDuracaoEmMinutos (int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos () {
        return duracaoEmMinutos;
    }

    public int getTotalDeReproducoes () {
        return totalDeReproducoes;
    }

    public int getCurtidas () {
        return curtidas;
    }

    public void reproduzir () {
        System.out.println("Reproduzindo " + titulo);
        totalDeReproducoes++;
    }

    public void curtir () {
        curtidas++;
    }

    public int getClassificacao () {
        return classificacao;
    }



    public void exibirFichaTecnica () {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
    }
}
