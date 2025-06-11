package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static final List<LightNovel> lightNovels = new ArrayList<>( List.of(
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
        IntSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingInt(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
