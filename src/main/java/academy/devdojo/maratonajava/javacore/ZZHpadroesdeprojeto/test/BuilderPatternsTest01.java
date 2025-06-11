package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternsTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .aPerson()
                .firstName("Jose")
                .lastName("Fernando")
                .username("fernnode")
                .email("Jose.fernando@fear.academy")
                .build();

        System.out.println(build);

    }
}
