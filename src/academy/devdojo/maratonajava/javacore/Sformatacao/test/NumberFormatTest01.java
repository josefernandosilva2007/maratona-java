package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeGR = Locale.GERMANY;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance(localeBR);
        nf[1] = NumberFormat.getInstance(localeJP);
        nf[2] = NumberFormat.getInstance(localeIT);
        nf[3] = NumberFormat.getInstance(localeGR);
        double valor = 1_000_000.67;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
