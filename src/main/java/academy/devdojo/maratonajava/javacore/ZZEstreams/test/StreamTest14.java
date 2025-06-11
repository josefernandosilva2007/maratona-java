package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
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
        Map<Category, LightNovel> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)
                                ), Optional::get)
                ));
        System.out.println(collect);
        System.out.println("---------");
        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
    }
}
