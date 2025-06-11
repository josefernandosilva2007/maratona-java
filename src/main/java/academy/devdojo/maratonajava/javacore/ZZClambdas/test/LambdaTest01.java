package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> name = List.of("Kaneki", "Touka", "Rize", "Eto", "Uta");
        forEarch(name , System.out::println);
    }

    private static <T> void forEarch(List<T> list,Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
