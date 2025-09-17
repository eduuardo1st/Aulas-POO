package poo.aulas.eduardojava.aula4.heranca.dominio;

public class Gerente extends Funcionario{
    private int equipe;
    private double bonus;

    public Gerente(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario, int  equipe, double bonus) {
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public void calcularSalarioComBonus() {
        this.salario = this.salario + this.bonus;
    }

    public void gerenciarEquipe(){
        System.out.println("Gerente com equipe de " + this.equipe + " funcionarios");
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Gerente com equipe de " + this.equipe);
        System.out.println("bonus: " + this.bonus);
    }

}
