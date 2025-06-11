package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Deku");
        lista.add("Deku");


        add(lista, new Consumidor("goku"));
        for (Object o : lista){
            System.out.println(o);
        }
    }

    private static void add(List list, Consumidor consumidor){
        list.add(consumidor);
    }
}
