package br.com.alura.desafio.modelos;

public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public void setAlbum (String album) {
        this.album = album;
    }

    public String getAlbum () {
        return album;
    }

    public void setCantor (String cantor) {
        this.cantor = cantor;
    }

    public String getCantor () {
        return cantor;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public String getGenero () {
        return genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
