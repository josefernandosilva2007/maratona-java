package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);

        Collections.sort(numbers);
        // -(ponto de insercao) -1;
        //index: 0,1,2,3,4;
        //list:  0,2,3,4,10;
        System.out.println(Collections.binarySearch(numbers, 2));
    }
}
