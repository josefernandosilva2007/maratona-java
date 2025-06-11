package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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

        System.out.println(listNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(listNovels.stream().anyMatch(ln -> ln.getPrice() > 400));
        System.out.println(listNovels.stream().noneMatch(ln -> ln.getPrice() > 0));

        listNovels.stream()
                .filter(ln -> ln.getPrice() > 300)
                .findAny()
                .ifPresent(System.out::println);

        listNovels.stream()
                .filter(ln -> ln.getPrice() > 500)
                .sorted(Comparator.comparing(LightNovel::getTitle).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        listNovels.stream()
                .filter(ln -> ln.getPrice() > 500)
                .max(Comparator.comparing(LightNovel::getTitle))
                .ifPresent(System.out::println);
    }
}
