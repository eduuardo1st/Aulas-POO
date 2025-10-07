package poo.aulas.eduardojava.aula5.escolaMusical;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    //metodo abstrato que deve ser implementado pelas sobcLasses
    public abstract void tocar();

    public void afinar(){
        System.out.println("Afinando o " + this.nome + ". . .");
    }

    public void mostrarInformacoes(){
        System.out.println("Instrumento: " + nome);
        System.out.println("Material: " + material);
    }

    public String getMaterial() {
        return material;
    }

    public String getNome() {
        return nome;
    }
}
