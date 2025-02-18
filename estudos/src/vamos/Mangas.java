package vamos;

public class Mangas {
    private String manga;
    private Char character;

    public Mangas(String manga, Char character) {
        this.manga = manga;
        this.character = character;
    }

    public void imprime(){
        System.out.println("----"+ manga + "---");
        System.out.println(character.getName());

    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public Char getCharacter() {
        return character;
    }

    public void setCharacter(Char character) {
        this.character = character;
    }
}
