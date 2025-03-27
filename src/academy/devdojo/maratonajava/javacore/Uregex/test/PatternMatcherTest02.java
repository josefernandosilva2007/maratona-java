package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = digitos
        // \D = tudo que nao for digito
        // \s = todos os espacos em branco
        // \S = Todos caracter excluindo branco
        // \w = a-z A-Z. digitos, _
        // \W = tudo que nao for incluso no \w
        String regex = "\\d";
        String texto ="adti2761t3421yg3kuygd961t2iy";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println(texto);
        System.out.println(regex);
        while(matcher.find()){
            System.out.print(matcher.start() +" "+matcher.group() + "\n");
        }

    }
}
