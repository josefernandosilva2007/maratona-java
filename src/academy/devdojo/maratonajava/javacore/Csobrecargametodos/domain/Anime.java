package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String name;
    private String types;
    private int episodes;
    private String genre;

    public void init(String name, String types, int episodes){
        this.name = name;
        this.types = types;
        this.episodes = episodes;
    }
    public void init(String name, String types, int episodes, String genre){
        this.init(name, types, episodes);
        this.genre = genre;
    }

    public void imprime() {
        System.out.println("Nome: "+this.name);
        System.out.println("Tipo: "+this.types);
        System.out.println("Episodios: "+this.episodes);
        System.out.println("Genero: " + this.genre);
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
