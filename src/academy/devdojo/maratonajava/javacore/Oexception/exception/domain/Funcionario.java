package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{
    public void salva() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionario");
    }
}
