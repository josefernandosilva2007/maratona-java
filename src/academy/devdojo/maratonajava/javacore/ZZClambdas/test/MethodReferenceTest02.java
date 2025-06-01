package academy.devdojo.maratonajava.javacore.ZZClambdas.test;


import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    private static final List<Anime> animeList = new ArrayList<>(List.of(new Anime("Tokyo Ghoul", 50), new Anime("Attack on Titan", 100), new Anime("Death Note", 50)));

    public static void main(String[] args) {
        AnimeComparator animeC = new AnimeComparator();
        animeList.sort(animeC::compareByEpisodesNonStatic);
        System.out.println(animeList);
        animeList.sort((a1,a2)-> animeC.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}