package poo.aulas.eduardojava.aula3.associacao.teste;

import poo.aulas.eduardojava.aula3.associacao.dominio.Jogador;

public class JogadorMain {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Marta");
        Jogador jogador3 = new Jogador("Maria");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.Imprime();
        }
    }
}
