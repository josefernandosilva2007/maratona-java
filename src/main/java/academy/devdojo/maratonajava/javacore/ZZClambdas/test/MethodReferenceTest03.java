package academy.devdojo.maratonajava.javacore.ZZClambdas.test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {

    public static void main(String[] args) {
        List<String> names =  new ArrayList<>(List.of("Kaneki", "Shikamaru", "Eren", "Subaru"));
        names.sort(String::compareTo);
        System.out.println(names);
        Function<String, Integer> stringToNumber = Integer::parseInt;
        Integer num = stringToNumber.apply("23");
        System.out.println(num);
        System.out.println(stringToNumber.apply("12"));

    }
}
