package poo.aulas.eduardojava.aula4.strings;

public class TesteString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc FJHFEIF   ";

        String s01 = original.toLowerCase();
        String s02 = original.toLowerCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');//função para trocar string de lugar
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");//mostra a primeira ocorrencia
        int j = original.lastIndexOf("bc");//mostra ultima ocorrencia

        System.out.println("Original: " + original);
        System.out.println("toLowerCase: " + s01);
        System.out.println("toUperCase " + s02);
        System.out.println("trim " + s03);//retira espaços a esquerda e a direita da string
        System.out.println("substring(2) " + s04);
        System.out.println("substring(2, 9) " + s05);
        System.out.println("replace('a', 'x') " + s06);
        System.out.println("replace('abc', 'xy') " + s07);
        System.out.println("Primeira ocorrencia('bc') " + i);
        System.out.println("Última ocorrencia('bc') " + j);
    }
}
