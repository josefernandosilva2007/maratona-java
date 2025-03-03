package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador comp = new Computador("Acer Nitro", 4000);
        Tomate tom = new Tomate("Tomate Carmem", 9.95);
        Produto tv = new Televisao("Samsung 24'", 5000);
        CalculadoraImposto.calcularImposto(comp);
        CalculadoraImposto.calcularImposto(tom);
        CalculadoraImposto.calcularImposto(tv);

    }
}
