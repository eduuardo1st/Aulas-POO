package poo.aulas.eduardojava.aula4.heranca.dominio;

public class Funcionario extends Pessoa{
    protected String cargo;
    protected String dataAdmissao;
    protected double salario;

    public Funcionario(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Data de Admissao: " + this.dataAdmissao);
        System.out.println("Salario: " + this.salario);
    }

    public double calcularSalarioAnual(){
        double salarioAnual = this.salario * 12;
        return salarioAnual;
    }

    public void receberAumento(double porcentagem){
        this.salario += this.salario * (porcentagem/100);
    }
}
