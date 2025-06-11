package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Jujutsu Kaisen", 5000, 10));
        mangas.add(new Manga(3L, "Spy x Family", 5000, 0));
        mangas.add(new Manga(1L, "Naruto", 3000, 3));
        mangas.add(new Manga(2L, "Choujin X", 6000, 1));
        mangas.add(new Manga(4L, "Attack on Titan", 4000, 0));


//        Iterator<Manga> iterator = mangas.iterator();
//        while (iterator.hasNext()) {
//            Manga manga = iterator.next();
//            if (manga.getQntd() == 0) {
//                iterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQntd() == 0);
        System.out.println(mangas);
    }
}
