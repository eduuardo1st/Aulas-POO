package poo.aulas.eduardojava.aula2.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private double altura;

    public Pessoa(String nome, int idade, String cpf, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
    }
    // metodo construtor

    public void apresentarPessoa(){
        System.out.println("Olá meu nome é " + nome);
    }

    public String getNome() {
        return nome;
    }
}
