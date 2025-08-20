package poo.aulas.eduardojava.aula2.pessoa;

public class Principal {
    public static void main(String[] args) {
        String nome = "Eduardo";
        int idade = 20;
        String cpf = "123";
        double altura = 22.5;

        Pessoa pessoa = new Pessoa(nome, idade, cpf, altura);
        Pessoa pessoa2 = new Pessoa("Arthurzin", 22, "232324234", 1.76);

        pessoa.apresentarPessoa();
        pessoa2.apresentarPessoa();

        Carro gol = new Carro("Gol", 2013, "vermelho");
        gol.proprietario(pessoa);
    }
}
