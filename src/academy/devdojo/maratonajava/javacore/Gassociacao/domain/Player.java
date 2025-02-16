package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Player {
    private String name;
    private Team team;
    public void imprime(){
        System.out.print(name);
        System.out.print(" - ");
        if (team != null){

            System.out.println(team.getName());
        } else {
            System.out.println("Nenhum Time");
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
