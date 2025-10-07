package poo.aulas.eduardojava.aula5.escolaMusical;

public class Bateria extends InstrumentoMusical{
    private int numeroPecas;

    public Bateria(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo na " + nome + " com " + getNumeroPecas() + " pecas!");
        System.out.println(" Boom! Tss! Bomm! Tss! ");
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das peles dos tambores.");
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Numero de peças: " + numeroPecas);
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }
}
