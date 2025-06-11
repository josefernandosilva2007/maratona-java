package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Pessoa p1 = new Pessoa() ;
        try {
            f1.salva();
        } catch (LoginInvalidoException |  FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            p1.salva();
        } catch (LoginInvalidoException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
