package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> school = new ArrayList<>();
        List<String> teachers = List.of("Professor 1","Professor 2","Professor 3","Professor 4","Professor 5","Professor 6");
        List<String> students = List.of("Student 1","Student 2","Student 3","Student 4","Student 5");
        school.add(teachers);
        school.add(students);

        for (List<String> people : school) {
            for (String person : people) {
                System.out.println(person);
            }


        }
        System.out.println("--------------");

        school.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}
