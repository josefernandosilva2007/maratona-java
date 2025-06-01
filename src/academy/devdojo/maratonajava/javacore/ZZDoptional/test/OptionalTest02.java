package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaTitle = MangaRepository.foundByTitle("Naruto");
        mangaTitle.ifPresent(manga -> manga.setTitle("Attack on Titan"));
        System.out.println(mangaTitle);
        System.out.println("---------------");

        Manga mangaID = MangaRepository.foundByID(1)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaID);
        System.out.println("---------------------------");

        Manga newManga = MangaRepository.foundByTitle("Chounjin X")
                .orElseGet(() -> new Manga(3, "Chounjin X", 80));

        System.out.println(newManga);

    }
}
