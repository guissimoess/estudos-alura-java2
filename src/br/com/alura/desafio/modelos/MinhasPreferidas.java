package br.com.alura.desafio.modelos;

public class MinhasPreferidas {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println("Adicionando " + audio.getTitulo() + " à playlist de preferidas");
        } else {
            System.out.println("A música " + audio.getTitulo() + " não é uma das preferidas");
        }
    }
}
