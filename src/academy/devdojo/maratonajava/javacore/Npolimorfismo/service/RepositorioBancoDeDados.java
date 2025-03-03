package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositorioBancoDeDados implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
