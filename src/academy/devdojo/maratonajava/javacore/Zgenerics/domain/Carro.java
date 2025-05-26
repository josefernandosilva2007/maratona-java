package academy.devdojo.maratonajava.javacore.Zgenerics.domain;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }
}
