package poo.aulas.eduardojava.aula5.escolaMusical;

public class Violao extends InstrumentoMusical{
    private int cordas;

    public Violao(String nome, String material, int cordas) {
        super(nome, material);
        this.cordas = cordas;
    }

    @Override
    public void tocar() {
        System.out.println("Dedilhandoo as " + this.cordas + " cordas do " + nome + "!");
        System.out.println(" Plim! Plim! Plão! ");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Apertando as tarraxas para ajustar a tensão das cordas.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Numero de cordas: " + cordas);
    }

    public int getCordas() {
        return cordas;
    }
}
