package poo.aulas.eduardojava.aula2;

import java.util.Arrays;

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        int[][] ano = new int[12][31];

        for (int mes = 0; mes < ano.length; mes++) {
            for (int dia = 0; dia < ano[mes].length; dia++) {
                ano[mes][dia] = dia + 1;
            }
        }

        for(int[] mes : ano){
            int i = 0;
            System.out.println(mes[i]);
            for (int dia : mes){
                System.out.print(dia);
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------");

        for (int mes = 0; mes < ano.length; mes++) {
            System.out.print("Mês " + (mes + 1) + ": ");
            for (int dia = 0; dia < ano[mes].length; dia++) {
                System.out.print(ano[mes][dia] + " ");
            }
            System.out.println();
        }
    }
}
