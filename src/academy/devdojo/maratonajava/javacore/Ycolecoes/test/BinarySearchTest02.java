package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIDComparator mangaByIDComparator = new MangaByIDComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Jujutsu Kaisen",5000));
        mangas.add(new Manga(3L,"Spy x Family",5000));
        mangas.add(new Manga(1L,"Naruto",3000));
        mangas.add(new Manga(2L,"Choujin X",6000));
        mangas.add(new Manga(4L,"Attack on Titan",4000));

        mangas.sort(new MangaByIDComparator());
        for (Manga n : mangas){
            System.out.println(n);
        }
        Manga mangaToSearch = new Manga(2L,"Choujin X",6000);
        System.out.println("----------");
        System.out.println(Collections.binarySearch(mangas, mangaToSearch,mangaByIDComparator));

    }
}
