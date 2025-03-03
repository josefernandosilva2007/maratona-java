package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositorioArquivo implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
