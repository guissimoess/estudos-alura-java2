package br.com.alura.desafio;

import br.com.alura.desafio.modelos.MinhasPreferidas;
import br.com.alura.desafio.modelos.Musica;
import br.com.alura.desafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Bohemian Rhapsody");
        musica.setDuracaoEmMinutos(6);
        musica.setCantor("Queen");
        musica.setAlbum("A Night at the Opera");

        for (int i=0; i < 100; i++) {
            musica.reproduzir();
        }

        System.out.println(musica.getTotalDeReproducoes());

        Podcast podcast = new Podcast();
        podcast.setTitulo("Hipsters Ponto Tech");
        podcast.setDuracaoEmMinutos(120);
        podcast.setHost("Paulo Silveira");
        podcast.setDescricao("Um podcast sobre tecnologia");

        for (int i=0; i<50; i++) {
            podcast.reproduzir();
            podcast.curtir();
        }

        System.out.println(podcast.getTotalDeReproducoes());
        System.out.println(podcast.getCurtidas());

        MinhasPreferidas preferidas = new  MinhasPreferidas();

        preferidas.inclui(musica);
        preferidas.inclui(podcast);



    }
}
