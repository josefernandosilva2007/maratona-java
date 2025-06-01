package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);

        nums.stream()
                .reduce((x,y) -> x*y)
                .ifPresent(System.out::println);


        nums.stream().reduce(Integer::sum).ifPresent(System.out::println);

    }
}
