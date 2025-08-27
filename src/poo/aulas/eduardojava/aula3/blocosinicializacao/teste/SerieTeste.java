package poo.aulas.eduardojava.aula3.blocosinicializacao.teste;

import poo.aulas.eduardojava.aula3.blocosinicializacao.dominio.Serie;

public class SerieTeste {
    public static void main(String[] args) {
        Serie serie = new Serie();
        for(int episodio : serie.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
