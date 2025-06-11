package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, long, int, float e double = 0
        //char ' '
        //boolean false
        //String null
        int numeroArray = 4;
        String[] nomes = new String[numeroArray];
        nomes[0] = "Subaru";
        nomes[1] = "Mitsubish";
        nomes[2] = "Corvette";
        nomes[3] = "Fiat Uno";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);

        }

    }
}
