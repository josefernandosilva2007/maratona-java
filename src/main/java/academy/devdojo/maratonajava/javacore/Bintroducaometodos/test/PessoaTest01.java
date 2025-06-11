package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.name = "Minji";
//        pessoa.age = 20;
        pessoa.setName("Minji");
        pessoa.setAge(20);

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
