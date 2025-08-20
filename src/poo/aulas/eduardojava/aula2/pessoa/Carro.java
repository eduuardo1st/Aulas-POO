package poo.aulas.eduardojava.aula2.pessoa;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private Pessoa proprietario;

    public Carro(String modelo, int ano, String cor, Pessoa proprietario) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public void proprietario(){
        System.out.println("O dono carro " + modelo + " é o " + this.proprietario.getNome());
    }


}
