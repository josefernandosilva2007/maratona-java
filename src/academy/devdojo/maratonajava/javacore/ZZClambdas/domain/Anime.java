package academy.devdojo.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private final String title;
    private final int episodes;


    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
