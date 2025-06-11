package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Fullmetal Alchemist", 200, Category.FANTASY),
            new LightNovel("Re:Zero", 500, Category.FANTASY),
            new LightNovel("Naruto: The Last", 399, Category.DRAMA),
            new LightNovel("No Game No Life", 400, Category.DRAMA),
            new LightNovel("Overlord", 300, Category.FANTASY),
            new LightNovel("Overlord", 300, Category.FANTASY),
            new LightNovel("Bunny Girl Senpai", 700, Category.ROMANCE),
            new LightNovel("Monogatari", 250, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
