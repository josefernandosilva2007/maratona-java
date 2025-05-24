package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1234", "Xiaomi");
        Smartphone s2 = new Smartphone("1234", "Xiaomi");

        System.out.println(s1.equals(s2));
    }
}
