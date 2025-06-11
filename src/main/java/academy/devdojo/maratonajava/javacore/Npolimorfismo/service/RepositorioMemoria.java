package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;


import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositorioMemoria implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
