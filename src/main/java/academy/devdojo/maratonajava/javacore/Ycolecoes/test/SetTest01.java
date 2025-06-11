package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Jujutsu Kaisen", 5000, 10));
        mangas.add(new Manga(3L, "Spy x Family", 5000, 0));
        mangas.add(new Manga(1L, "Naruto", 3000, 3));
        mangas.add(new Manga(2L, "Choujin X", 6000, 1));
        mangas.add(new Manga(4L, "Attack on Titan", 4000, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 4000, 0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
