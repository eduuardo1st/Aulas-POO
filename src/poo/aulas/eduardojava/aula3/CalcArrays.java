package poo.aulas.eduardojava.aula3;

public class CalcArrays {

    public void somaArray(int [] numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){ // varargs deve sempre ser o último parametro para nao dar confusao
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void main(String[] args) {
        CalcArrays calc = new CalcArrays();
        int[] numeros = new int[]{1,2,3,4,5};

        calc.somaVarArgs(1,2,3,4,5);
        calc.somaArray(numeros);
    }

}
