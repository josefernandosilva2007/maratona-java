package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String st = "Fernando";
        st.concat("Silva");
        st.substring(0,3);
        System.out.println(st);
        StringBuilder sb = new StringBuilder("Fernando");
        sb.append(" Silva").append(" | Fern");
        sb.reverse();
        sb.reverse();
        sb.delete(0,2);



        System.out.println(sb);
    }
}
