package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Cauazin");
        Player player2 = new Player("DGzin");
        Player player3 = new Player("Tuyz");
        Player player4 = new Player("V1nny");
        Player player5 = new Player("Pancada");
        Player[] players = {player, player2, player3, player4, player5};
        Team team = new Team("LOUD");

        player.setTeam(team);
        player3.setTeam(team);
        player2.setTeam(team);
        player4.setTeam(team);
        player5.setTeam(team);
        team.setPlayers(players);

        System.out.println("--- Player ---");
        player.imprime();
        player2.imprime();
        player3.imprime();
        player4.imprime();
        player5.imprime();
        System.out.println("--- Team ---");
        team.imprime();

    }
}
