package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> carroList = criarArrayComObjeto(new Carro("BMW"));
        System.out.println(carroList);
    }
    private static <T> List<T> criarArrayComObjeto(T t){
        return List.of(t);
    }
}
