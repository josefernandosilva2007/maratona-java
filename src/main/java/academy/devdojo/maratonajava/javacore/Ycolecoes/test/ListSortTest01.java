package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Naruto");
        mangas.add("Choujin X");
        mangas.add("Tokyo Ghoul");
        mangas.add("Pokemon Adventures");
        mangas.add("Attack on Titan");

        Collections.sort(mangas);


        for (String manga : mangas){
            System.out.println(manga);
        }

        System.out.println("-------------------");

        List<Integer> dinheiros = new ArrayList<>();

        dinheiros.add(1000);
        dinheiros.add(4098);
        dinheiros.add(1023);
        dinheiros.add(20304);
        System.out.println(dinheiros);
        Collections.sort(dinheiros);

        System.out.println(dinheiros);
    }
}
