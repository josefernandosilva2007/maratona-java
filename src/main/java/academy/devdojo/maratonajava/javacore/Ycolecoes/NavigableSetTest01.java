package academy.devdojo.maratonajava.javacore.Ycolecoes;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphoneByMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaByPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneByMarcaComparator());
        Smartphone smartphone = new Smartphone("1234", "Xiaomi");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaByPriceComparator());
        mangas.add(new Manga(5L, "Jujutsu Kaisen", 5000, 10));
        mangas.add(new Manga(3L, "Spy x Family", 5000, 0));
        mangas.add(new Manga(1L, "Naruto", 3000, 3));
        mangas.add(new Manga(2L, "Choujin X", 6000, 1));
        mangas.add(new Manga(4L, "Attack on Titan", 4000, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 4000, 0));


        Manga goodnightPunPun = new Manga(6L, "Goodnight PunPun", 3500, 1);

        mangas.descendingSet().forEach(System.out::println);

        System.out.println("------------------");
        System.out.println(mangas.floor(goodnightPunPun));

    }
}
