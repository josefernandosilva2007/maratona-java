package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;


class Animal{
    void walk(){
        System.out.println("Animal Walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            void walk() {
                System.out.println("Woof Woof");
            }
        };

        animal.walk();
    }
}
