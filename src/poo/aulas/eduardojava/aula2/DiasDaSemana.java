package poo.aulas.eduardojava.aula2;

public class DiasDaSemana {
    public static void main(String[] args) {
        byte dia = 3;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("É final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia de semana!");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
