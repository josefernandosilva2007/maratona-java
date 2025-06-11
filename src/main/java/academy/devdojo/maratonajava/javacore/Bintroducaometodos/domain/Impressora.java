package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Impressora {
    public void imprime(Personagem personagem){
        System.out.println(personagem.nome);
        System.out.println(personagem.sexo);
        System.out.println(personagem.idade);
    }
}
