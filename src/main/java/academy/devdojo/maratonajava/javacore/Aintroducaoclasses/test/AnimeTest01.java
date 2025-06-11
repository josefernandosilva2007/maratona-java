package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.name = "Solo Leveling";
        anime.released = 2024;
        anime.genre = "Açao, Fantasia";

        System.out.println( "Name: " +  anime.name +  " Realesed: " + anime.released + " Genre: "  + anime.genre);

    }
}
