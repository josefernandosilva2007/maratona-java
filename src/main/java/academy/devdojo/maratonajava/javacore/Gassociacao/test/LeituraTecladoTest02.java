package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <3; i++) {
            System.out.println("---- FACA UMA PERGUNTA ----");
            String ask = input.nextLine();
            if (ask.charAt(0) == 'E'){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }
        }

    }
}
