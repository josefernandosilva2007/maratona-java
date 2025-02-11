package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setEpisodes(271);
//        anime.setName("Jujutsu Kaisen");
//        anime.setTypes("Manga");

        anime.init("Jujutsu Kaisen","Manga",271);

        anime.imprime();
    }
}
