package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name");
        String name = input.nextLine();
        System.out.println("Age");
        int age = input.nextInt();
        System.out.println("Gender");
        char gender = input.next().charAt(0);

        System.out.println("-----------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);

    }
}
