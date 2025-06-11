package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Tokyo Ghoul", 50), new Anime("Attack on Titan", 100), new Anime("Death Note", 50)));
//        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparator::compareByTitle);
        System.out.println(animeList);
        System.out.println("----------------------");
        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);






    }
}
