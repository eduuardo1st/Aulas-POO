package poo.aulas.eduardojava.aula3.associacao.dominio;

public class Jogador {
    private String nome;

    public void Imprime(){
        System.out.println(this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
