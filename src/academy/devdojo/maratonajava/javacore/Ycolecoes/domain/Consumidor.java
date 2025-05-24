package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String name;

    public Consumidor( String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
