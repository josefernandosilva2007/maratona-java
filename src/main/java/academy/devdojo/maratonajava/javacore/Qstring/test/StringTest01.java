package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Fernando"; // String Constat Pool
        String name2 = "Fernando"; // String Literal
        name = name.concat(" Silva");
        System.out.println(name);
        System.out.println(name == name2);
        // 1 variacel de referencia, 2 um objeto do tipo String, 3 uma String no Pool of String
        String name3 = new String("Fernando"); // Objeto em um espaco diferente do String Pool
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
