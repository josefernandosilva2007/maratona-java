package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Jose");
        Consumidor consumidor2 = new Consumidor("Nicolas");


        Manga manga1 = new Manga(5L, "Jujutsu Kaisen", 5000);
        Manga manga2 = new Manga(3L,"Spy x Family",5000);
        Manga manga3 = new Manga(1L,"Naruto",3000);
        Manga manga4 = new Manga(2L,"Choujin X",6000);
        Manga manga5 = new Manga(4L,"Attack on Titan",4000);

        System.out.println(consumidor1);
        List<Manga> consumidor1List = List.of(manga3, manga4,manga5);
        List<Manga> consumidor2List = List.of(manga1, manga2);
        Map<Consumidor, List<Manga>> map = new HashMap<>();
        map.put(consumidor1, consumidor1List);
        map.put(consumidor2, consumidor2List);

        for (Map.Entry<Consumidor,List<Manga>> entry : map.entrySet()){
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("--- "  + manga.getName());
            }

        }
    }
}
