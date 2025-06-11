package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "       Sasuke        ";
        String nums = "012345";
        for (int i = 0; i < name.length() ; i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println(name.replace("S","c"));
        name = name.replace("S","C");
        name = name.replace("s","c");
        name = name.replace("u","i");
        System.out.println(name);

        System.out.println(nums.substring(0,6));
        System.out.println(name.trim());

    }
}
