package poo.aulas.eduardojava.aula5.escolaMusical;

public class EscolaMusical {
    public void apresentar(InstrumentoMusical[] orquestra){
        for (InstrumentoMusical instrumento : orquestra) {
            System.out.println("========================================");
            instrumento.mostrarInformacoes();
            System.out.println();

            instrumento.afinar();
            System.out.println();

            instrumento.tocar();
            System.out.println("========================================\n");
        }
    }

    public static void main(String[] args) {
        InstrumentoMusical[] orquestra = new InstrumentoMusical[5];
        EscolaMusical escola = new EscolaMusical();

        orquestra[0] = new Piano("Piano de Cauda", "Madeira de Nogueira", 88);
        orquestra[1] = new Violao("Violão Folk", "Madeira e Aço", 6);
        orquestra[2] = new Bateria("Bateria Acústica", "Madeira e Metal", 5);
        orquestra[3] = new Saxofone("Saxofone Tenor", "Latão", "Tenor");
        orquestra[4] = new Violao("Violão Clássico", "Madeira e Nylon", 6);

        escola.apresentar(orquestra);
    }
}
