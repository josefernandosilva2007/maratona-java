package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Kang Jinhyuk");
        Player player2 = new Player("Teresa du Laurentia");
        Player player3 = new Player("Casey Law");
        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.imprime();
            
        }


    }
}
