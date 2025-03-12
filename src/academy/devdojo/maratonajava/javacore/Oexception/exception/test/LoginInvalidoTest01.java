package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner i = new Scanner(System.in);
        String usernameDB =  "Kaguya";
        String senhaDB =  "neymar124";
        System.out.println("USUARIO: ");
        String usernameDigitado = i.nextLine();
        System.out.println("SENHA: ");
        String senhaDigitada = i.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }

        System.out.println("Login feito com sucesso");
    }
}
