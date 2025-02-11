package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen","Manga", 271,"Açao", "Shueisha" );
//        anime.setEpisodes(271);
//        anime.setName("Jujutsu Kaisen");
//        anime.setTypes("Manga");

        anime.imprime();
    }
}
