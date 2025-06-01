package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    private static final List<Anime> animeList = new ArrayList<>(List.of(new Anime("Tokyo Ghoul", 50), new Anime("Attack on Titan", 100), new Anime("Death Note", 50)));
    public static void main(String[] args) {
        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;
        AnimeComparator animeC = animeComparatorSupplier.get();
        animeList.sort(animeC::compareByEpisodesNonStatic);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Re:Zero", 80));
    }
}
