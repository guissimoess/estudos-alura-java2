package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    public int getTempoTotal() {
        return tempoTotal;
    }

    /*
    public void inclui (Serie serie) {
        tempoTotal += serie.getDuracaoEmMinutos();
    }

    public void inclui (Filme filme) {
        tempoTotal += filme.getDuracaoEmMinutos();
    }
    */

    public void inclui (Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo + " ao tempo total");
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
