package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static final List<LightNovel> listNovels = new ArrayList<>( List.of(
            new LightNovel("Fullmetal Alchemist", 200),
            new LightNovel("Re:Zero", 500),
            new LightNovel("Naruto: The Last", 399),
            new LightNovel("No Game No Life", 400),
            new LightNovel("Overlord", 300),
            new LightNovel("Overlord", 300),
            new LightNovel("Bunny Girl Senpai", 700),
            new LightNovel("Monogatari", 250)
    ));

    public static void main(String[] args) {
        listNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Integer::sum)
                .ifPresent(System.out::println)
        ;

        int sum = listNovels.stream()
                .mapToInt(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

    }
}
