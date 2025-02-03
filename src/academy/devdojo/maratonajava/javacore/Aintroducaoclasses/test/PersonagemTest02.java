package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Personagem;

public class PersonagemTest02 {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Personagem personagem2 = new Personagem();


        personagem2.nome = "Alfonse Elric";
        System.out.println(personagem.nome);
        System.out.println(personagem.idade);
        System.out.println(personagem.sexo);

        System.out.println("------------------------------");

        System.out.println(personagem2.nome);
        System.out.println(personagem2.idade);
        System.out.println(personagem2.sexo);


    }
}
