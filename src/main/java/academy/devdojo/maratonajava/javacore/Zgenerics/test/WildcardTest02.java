package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> c = List.of(new Cachorro());
        List<Gato> g = List.of(new Gato());
        print(c);
    }
    private static void print(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
}
