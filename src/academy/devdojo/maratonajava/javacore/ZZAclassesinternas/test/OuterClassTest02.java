package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String name = "Kaneki";

    void print() {
        class LocalClass {
            public void printLocal() {
                System.out.println(name);
            }

        }
        LocalClass lclass = new LocalClass();
        lclass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 out = new OuterClassTest02();
        out.print();

    }
}
