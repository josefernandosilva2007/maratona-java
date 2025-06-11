package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Sei la";

    static class Nested {

        private String surname = "uiui";
        void print(){
            System.out.println(new OuterClassesTest03().name+ " "+ surname);
        }
    }


    public static void main(String[] args) {
        new Nested().print();
    }
}
