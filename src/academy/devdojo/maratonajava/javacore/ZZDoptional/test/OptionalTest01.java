package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> nameOp = Optional.ofNullable(findName("Jose"));
        System.out.println(nameOp);
        System.out.println("-----------");

        System.out.println(nameOp.orElse("NAO ACHEI"));

        nameOp.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static String findName(String name) {
        List<String> list = List.of("Jose", "Fernando");
        int i = list.indexOf(name);
        if (i != 1) {
            return list.get(i);
        }
        return null;
    }
}

