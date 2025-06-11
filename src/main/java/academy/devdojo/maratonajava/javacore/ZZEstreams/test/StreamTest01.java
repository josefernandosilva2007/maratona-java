package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamTest01 {
    private static final List<LightNovel> listNovels = new ArrayList<>( List.of(
            new LightNovel("Fullmetal Alchemist", 200),
            new LightNovel("Re:Zero", 500),
            new LightNovel("Naruto: The Last", 399),
            new LightNovel("No Game No Life", 400),
            new LightNovel("Overlord", 300),
            new LightNovel("Bunny Girl Senpai", 700),
            new LightNovel("Monogatari", 250)
    ));

    public static void main(String[] args) {
        listNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List <String> titles = new ArrayList<>();
        for (LightNovel l : listNovels) {
            if (l.getPrice() <= 400){
                titles.add(l.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }
        System.out.println(titles);

    }
}
