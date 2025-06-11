package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Frieren", 15000);
        Desenvolvedor d1 = new Desenvolvedor("Fern", 8000);
        System.out.println(g1);
        System.out.println(d1);
        g1.imprime();
        d1.imprime();
    }
}
