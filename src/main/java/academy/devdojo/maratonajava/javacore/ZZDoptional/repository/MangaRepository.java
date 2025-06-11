package academy.devdojo.maratonajava.javacore.ZZDoptional.repository;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
        private static final List<Manga> mangaList = List.of(
                new Manga(1, "Tokyo Ghoul",50),
                new Manga(2, "Naruto",100)
                );


    public static Optional<Manga> foundByID(Integer id){
        return foundBy(m -> m.getId().equals(id));
    }

        public static Optional<Manga> foundByTitle(String title){
            return foundBy(m -> m.getTitle().equals(title));
        }

        private static Optional<Manga> foundBy(Predicate<Manga> predicate){
            Manga found = null;
            for (Manga m: mangaList){
                if (predicate.test(m)){
                    found = m;
                }
            }
            return Optional.ofNullable(found);
        }

}
