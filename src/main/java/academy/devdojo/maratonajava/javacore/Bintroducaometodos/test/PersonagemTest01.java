package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Impressora;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Personagem;

public class PersonagemTest01 {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        Impressora impressora = new Impressora();


        personagem2.nome = "Eren";
        personagem2.idade = 16;
        personagem2.sexo = 'M';

        personagem1.nome = "Mikasa";
        personagem1.idade = 16;
        personagem1.sexo = 'F';

        System.out.println(personagem2.nome);
        System.out.println(personagem2.sexo);
        System.out.println(personagem2.idade);

        System.out.println("=============================");

        System.out.println(personagem1.nome);
        System.out.println(personagem1.sexo);
        System.out.println(personagem1.idade);

        System.out.println("----------------USANDO A IMPRESSORA--------------------");
        impressora.imprime(personagem1);
        impressora.imprime(personagem2);



    }
}
