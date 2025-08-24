package poo.aulas.eduardojava.aula3.construtores.Teste;

import poo.aulas.eduardojava.aula3.construtores.Dominio.Series;

public class SerieTeste {
    public static void main(String[] args) {
        Series series = new Series("Cyber punk", "Anime", 12, "Futurista");

        series.imprimir();
    }
}
