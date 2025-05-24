package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIDComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga x, Manga y) {
        return x.getId().compareTo(y.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Jujutsu Kaisen",5000));
        mangas.add(new Manga(3L,"Spy x Family",5000));
        mangas.add(new Manga(1L,"Naruto",3000));// Preco em INT so dividir por 100, nesse caso eh 40 reais
        mangas.add(new Manga(2L,"Choujin X",6000));
        mangas.add(new Manga(4L,"Attack on Titan",4000));
        System.out.println("------SEM SORT------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-----SORT POR NOME-----");
        for (Manga manga : mangas){
            System.out.println(manga);
        }


//        Collections.sort(mangas, new MangaByIDComparator());
        mangas.sort(new MangaByIDComparator()); // nesse caso sou obrigado a passar um comparator
        System.out.println("-----SORT POR ID-----");
        for (Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
