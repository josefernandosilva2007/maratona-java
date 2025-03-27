package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = digitos
        // \D = tudo que nao for digito
        // \s = todos os espacos em branco
        // \S = Todos caracter excluindo branco
        // \w = a-z A-Z. digitos, _
        // \W = tudo que nao for incluso no \w
        // [] range
        //? zero ou uma
        //* zero ou mais
        //+ uma ou mais
        //{n,m} de n ate m
        // () agrupamento
        // | ou
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto ="12 32 0xf23 0XA23 0x";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println(texto);
        System.out.println(regex);
        while(matcher.find()){
            System.out.print(matcher.start() +" "+matcher.group() + "\n");
        }

        int numeroHex = 0x2A7DD17;
        System.out.println(numeroHex);

    }
}
