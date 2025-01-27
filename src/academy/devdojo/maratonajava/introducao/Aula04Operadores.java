package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores basicos + - / *
        int n1 = 10;
        int n2 = 20;
        //posso fazer a operacao tanto numa variavel quanto no println
        float resultado = n1 + n2;
        System.out.println(resultado);

        //---------------------------Relacionais--------------------------------------
        // resto = %
        int resto = 20 % 2;
        System.out.println(resto);
        //< > <= >= ==(comparando e nao atribuindo) != (diferente)
        //SEMPRE VAO RET0RNAR VALORES BOOLEANOS

        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezIgualDez = 10 == 10;
        System.out.println("isDezIgualDez = " + isDezIgualDez);
        System.out.println("isDezDiferenteDez = " + isDezDiferenteDez);

        //&& (AND) || (OR) !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorContaCorrente > valorPlaystation || valorContaPoupanca > valorPlaystation;

        System.out.println(isPlaystationCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 800
        bonus *= 2; //3600
        bonus /= 2; // 900
        bonus %= 2; // 0

        System.out.println(bonus);

        // ++ conta de um em um tbm tem o --
        int contador = 0;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
