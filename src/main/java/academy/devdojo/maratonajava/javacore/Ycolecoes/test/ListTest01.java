package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Touka");
        nomes.add("Hinami");

        for (int i = 0; i < nomes.size() ; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        List<Integer> numeros1 = new ArrayList<>();
        numeros.add(16);
        numeros1.add(17);
        for(Integer n : numeros1){
               if(!numeros.contains(n)){
                   numeros.add(n);
               }
            System.out.println(numeros);
        }



    }
}
