package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int n1 = 2;
        int n2 = 3;
        calculadora.alteraDoisNumeros(n1, n2);
        n1 = 24;
        n2 = 34;

        System.out.println(n1);
        System.out.println(n2);

    }
}
