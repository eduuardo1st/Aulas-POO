package poo.aulas.eduardojava.aula3.blocosinicializacao.dominio;

public class Serie {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de Classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Serie() {
        for(int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
