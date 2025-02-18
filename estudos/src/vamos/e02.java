package vamos;

import java.util.Scanner;

public class e02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Char character = new Char();
        System.out.println("Digite seu personagem: ");
        character.setName(input.nextLine());
        Mangas soloLeveling = new Mangas("Solo leveling",character);



        soloLeveling.imprime();


    }
}
