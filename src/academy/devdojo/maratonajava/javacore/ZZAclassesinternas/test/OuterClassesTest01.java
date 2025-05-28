package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "receba";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        Inner inner = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
    }
}
