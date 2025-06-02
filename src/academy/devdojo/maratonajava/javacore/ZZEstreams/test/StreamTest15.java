package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, IntSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingInt(LightNovel::getPrice)));
        System.out.println(collect);


        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toList())));
        System.out.println(collect1);
        //podemos usar o toSet inves do toList
        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 600 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
