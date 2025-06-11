package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));


        Integer[] arrayNumbers = new Integer[]{1,2,3};

        List<Integer> arrayList = Arrays.asList(arrayNumbers);

        System.out.println(arrayList);

        System.out.println("-------");
        List<Integer> list = new ArrayList<>(Arrays.asList(arrayNumbers));
        list.add(10);
        System.out.println(list);

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
    }
}
