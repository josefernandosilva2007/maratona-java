package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String name;
    private String types;
    private int episodes;
    private String genre;
    private String studio;


    public Anime(String name, String types, int episodes, String genre) {
        this.name = name;
        this.types = types;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(String name, String types, int episodes, String genre, String studio){
        this(name, types, episodes,genre);
        this.studio = studio;
    }


    public Anime() {

    }

    public void imprime() {
        System.out.println("Nome: " + this.name);
        System.out.println("Tipo: " + this.types);
        System.out.println("Episodios: " + this.episodes);
        System.out.println("Genero: " + this.genre);
        System.out.println("Estudio: " + this.studio);
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getTypes() {
        return types;
    }


    public void setEpisodes(int episodes) {
        this.episodes = episodes;

    }

    public int getEpisodes() {
        return episodes;
    }
}
