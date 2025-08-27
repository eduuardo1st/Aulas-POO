package poo.aulas.eduardojava.aula3.modificadorestatico.dominio;

public class Serie {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicializacao é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de Classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Serie() {
        for(int episodio : Serie.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
