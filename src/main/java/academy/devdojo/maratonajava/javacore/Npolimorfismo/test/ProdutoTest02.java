package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9700X3D", 20000);
        System.out.println(produto.getName());
        System.out.println(produto.getValor());
        System.out.println(produto.taxa());
        System.out.println("---------------------");
        Produto produto2 = new Tomate("Amarelo", 2.00);
        System.out.println(produto2.getName());
        System.out.println(produto2.getValor());
        System.out.println(produto2.taxa());
    }
}
