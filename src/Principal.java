import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(175);
        filme.setIncluidoNoPlano(true);
        filme.setSomaAvaliacoes(10);

        filme.exibirFichaTecnica();
        filme.avalia(8.0);
        filme.avalia(3.0);
        filme.avalia(10.0);

        System.out.println(filme.getSomaAvaliacoes());
        System.out.println(filme.pegaMedia());
        System.out.println(filme.pegaMedia());
        System.out.println(filme.getTotalDeAvailiacoes());


        filme.setDiretor("Francis Ford Coppola");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar " + lost.getNome() + ": " +lost.getDuracaoEmMinutos() + " minutos");
        lost.exibirFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setSomaAvaliacoes(10);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(outroFilme);
        calc.inclui(filme);
        calc.inclui(lost);
        System.out.println("tempo total " + calc.getTempoTotal());



    }
}