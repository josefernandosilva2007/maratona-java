package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Personagem;

public class PersonagemTest01 {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.nome = "Sung Jin-Woo";
        personagem.idade = 24;
        personagem.sexo = 'M';

        System.out.println(personagem.nome);
        System.out.println(personagem.idade);
        System.out.println(personagem.sexo);
    }
}
