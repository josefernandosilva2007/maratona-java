package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

     public static void calcularImposto(Produto produto){
        double taxa = produto.taxa();
         System.out.println("---Relatorio Imposto---");
         System.out.println("Produto: "+ produto.getName());
         System.out.println("Valor: "+ produto.getValor());
         System.out.println("Taxa: "+ taxa);
         if(produto instanceof Tomate){
             System.out.println(((Tomate) produto).getDataValidade());
         }

     }

}
