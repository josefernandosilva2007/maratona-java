package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeKR = new Locale("kor","KR");
        Locale localeSW = new Locale("it","CH");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeKR);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSW);

        System.out.println("KOREA "+ df1.format(calendar.getTime()));
        System.out.println("SW "+ df2.format(calendar.getTime()));
    }
}
