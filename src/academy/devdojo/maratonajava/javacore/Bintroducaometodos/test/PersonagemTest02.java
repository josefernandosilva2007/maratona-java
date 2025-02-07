package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Impressora;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Personagem;

public class PersonagemTest02 {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();



        personagem2.nome = "Eren";
        personagem2.idade = 16;
        personagem2.sexo = 'M';

        personagem1.nome = "Mikasa";
        personagem1.idade = 16;
        personagem1.sexo = 'F';

        personagem1.imprime();
        personagem2.imprime();
    }
}
