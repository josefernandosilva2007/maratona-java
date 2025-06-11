package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeGR = Locale.GERMANY;
        NumberFormat[] nf = new NumberFormat[4];
        // muda para o formato da moeda padrao do pais
        nf[0] = NumberFormat.getCurrencyInstance(localeBR); // o que muda eh o currency
        nf[1] = NumberFormat.getCurrencyInstance(localeJP);
        nf[2] = NumberFormat.getCurrencyInstance(localeIT);
        nf[3] = NumberFormat.getCurrencyInstance(localeGR);
        double valor = 1_000_000.67;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
