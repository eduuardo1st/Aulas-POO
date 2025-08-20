package poo.aulas.eduardojava.aula2.pessoa;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void proprietario(Pessoa pessoa){
        System.out.println("O dono carro " + modelo + " é o " + pessoa.getNome());
    }
}
